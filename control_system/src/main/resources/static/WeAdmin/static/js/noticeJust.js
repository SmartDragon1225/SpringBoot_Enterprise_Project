function init(){
    $("#noticeForm").bootstrapTable({
        url:'/notice/getAllByPage',//要请求数据的文件路径
        method: 'get',
        locale: 'zh-CN', //中文支持
        queryParams: function(params) {
            return {
                pageNum: this.pageNumber,
                pageSize: this.pageSize,
                createTime:$(".createTime").val(),
                activeTime:$(".activeTime").val()
            };
        },
        responseHandler:function (res) {
            return {
                "rows": res.data.records,
                "total": res.data.totalNum
            }
        },
        pagination: true, // 是否分页
        sidePagination: 'server', //设置前端/后端分页
        pageList: '[10, 20, 50]',
        pageNumber: 1, //如果设置了分页，首页页码
        pageSize: 5, //如果设置了分页，页面数据条数
        paginationVAlign: 'bottom', //指定 分页条 在垂直方向的位置
        paginationHAlign: 'right', //指定 分页条 在水平方向的位置。
        paginationPreText: '上一页', //指定分页条中上一页按钮的图标或文字
        paginationNextText: '下一页', //指定分页条中下一页按钮的图标或文字
        formatLoadingMessage: function () {
            return "请稍等，正在加载中...";
        },
        columns: [ {
            field: 'noticeId',
            title: '编号'
        }, {
            field: 'title',
            title: '标题'
        }, {
            field: 'userName',
            title: '创建者'
        }, {
            field: 'activeTime',
            title: '截止时间',
            formatter:function (value) {
                return formatTime2Short(new Date(value));
            }
        },{
            title: '操作',
            field: 'noticeId',
            formatter: function (row) {
                return '<a href="#" onclick="editNotice('+row+')"    target="_self">修改</a>';
            }
        } ]
    });
}

layui.use(['layer','form'], function () {
    //初始化数据
    init();
});

//搜索
function queryNotice() {
    $("#noticeForm").bootstrapTable('refresh');
}

//修改
function editNotice(id) {
    location.href = './edit.html?id='+id;
}