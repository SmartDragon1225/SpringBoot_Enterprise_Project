layui.use(['layer','form'], function () {
    var form = layui.form;
    get('/department/getAll',null,function (data) {
        deptSelectType('dept',data);
        form.render();
    });
    //初始化数据
    init();
});
function init() {
    $("#jobTable").bootstrapTable({
        url:'/job/getAllByPage',//要请求数据的文件路径
        method: 'get',
        locale: 'zh-CN', //中文支持
        queryParams: function(params) {
            return {
                pageNum: this.pageNumber,
                pageSize: this.pageSize,
                departmentId:$("#dept").val()===0?null:$("#dept").val(),
                name:$("#name").val()
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
            field: 'jobId',
            title: '编号'
        }, {
            field: 'deptName',
            title: '部门名称'
        }, {
            field: 'name',
            title: '职位名称'
        }, {
            field: 'remark',
            title: '职位描述'
        }, {
            field: 'statusName',
            title: '状态'
        },{
            title: '操作',
            field: 'jobId',
            formatter: function (row) {
                return '<a href="#" onclick="editJob('+row+')"    target="_self">修改</a>';
            }
        } ]
    });
}

//搜索
function queryJob() {
    $("#jobTable").bootstrapTable("refresh");
}

//修改
function editJob(id) {
    location.href = './edit.html?id='+id;
}