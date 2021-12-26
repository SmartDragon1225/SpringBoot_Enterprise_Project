layui.use(['layer','form'], function () {
    var form = layui.form;
    init(form);
    function init(form) {
        //获取所有可用部门
        get('/department/getAll',null,function (data) {
            deptSelectType('dept',data);
            form.render();
        });
        //下拉被选中时
        form.on('select(dept)', function(data){
            if (data.value===0) {
                selectJob(0);
            }else {
                selectJob(data.value);
            }
        });
    }
    //加载职位
    function selectJob(departmentId) {
        get('/job/getJobByDeptId',{deptId:departmentId},function (data) {
            jobSelectType('jobs',data);
            form.render();
        })
    }
});

function addEmployee() {
    post('/employee/addEmployee',$("#employeeForm").serialize(),function (data) {
        layer.msg(data);
    })
}

