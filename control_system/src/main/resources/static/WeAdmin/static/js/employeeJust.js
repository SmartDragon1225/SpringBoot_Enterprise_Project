function init() {
    $("#employeeTable").bootstrapTable({
        url:'/employee/getAllByPage',//要请求数据的文件路径
        method: 'get',
        locale: 'zh-CN', //中文支持
        queryParams: function(params) {
            return {
                pageNum: this.pageNumber,
                pageSize: this.pageSize,
                name:$("#name").val(),
                deptId:$("#deptId").val()==0?null:$("#deptId").val(),
                jobId:$("#jobId").val()==='请选择职位'||$("#jobId").val()==0?null:$("#jobId").val()
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
            field: 'employeeId',
            title: '编号'
        }, {
            field: 'name',
            title: '员工姓名'
        }, {
            field: 'deptName',
            title: '所属部门'
        }, {
            field: 'jobName',
            title: '所属职位'
        }, {
            field: 'recordId',
            title: '档案编号'
        }, {
            field: 'createTime',
            title: '入职时间',
            formatter:function (value) {
                return formatTime2Short(new Date(value));
            }
        },{
            title: '操作',
            field: 'employeeId',
            formatter: function (row) {
                return '<a href="#" onclick="editEmployee('+row+')"    target="_self">修改</a>';
            }
        } ]
    });
}
layui.use(['layer','form'], function () {
    var form = layui.form;
    //获取所有可用部门
    get('/department/getAll',null,function (data) {
        deptSelectType('deptId',data);
        form.render();
    });
    //加载职位
    get('/job/getJobOfAll',null,function (data) {
            jobSelectType('jobId',data);
            form.render();
    });
    //获取查询所有结果
    init();
});

//查询
function queryEmployee() {
    $("#employeeTable").bootstrapTable("refresh");
}

//修改
function editEmployee(id) {
    location.href = './edit.html?id='+id;
}