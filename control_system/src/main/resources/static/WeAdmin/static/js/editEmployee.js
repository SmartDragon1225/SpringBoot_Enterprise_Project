layui.use(['layer','form','util'], function () {
    var form = layui.form;
    var util = layui.util;
    var parameter = GetRequest();
    //获取数据
    get('/employee/getInfoById',{employeeId:parameter.id},function (data) {
        //获取所有可用部门
        deptSelectType('deptId',data.dept);
        //加载职位
        jobSelectType('jobId',data.job);
        $("#employeeId").val(data.employee.employeeId);
        $("#recordId").val(data.employee.record.recordId);
        $("#name").val(data.employee.name);
        $("#cardId").val(data.employee.record.cardId);
        $("#sex").val(data.employee.record.sex);
        $("#phone").val(data.employee.record.phone);
        $("#deptId").val(data.employee.departmentId);
        $("#jobId").val(data.employee.jobId);
        $("#education").val(data.employee.record.education);
        $("#email").val(data.employee.record.email);
        $("#party").val(data.employee.record.party);
        $("#qqNum").val(data.employee.record.qqNum);
        $("#address").val(data.employee.record.address);
        $("#postCode").val(data.employee.record.postCode);
        $("#end").val(util.toDateString(data.employee.record.birthday,'yyyy-MM-dd'));
        $("#race").val(data.employee.record.race);
        $("#speciality").val(data.employee.record.speciality);
        $("#hobby").val(data.employee.record.hobby);
        $("#remark").val(data.employee.record.remark);
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
    //加载职位
    function selectJob(departmentId) {
        get('/job/getJobByDeptId',{deptId:departmentId},function (data) {
            jobSelectType('jobId',data);
            form.render();
        })
    }
});
//获取url中"?"符后的字串
function GetRequest() {
    var url = location.search;
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
            theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}

//修改信息
function updateRecord() {
    post('/employee/updateRecord',$("#employeeForm").serialize(),function (data) {
        location.href = "./adjust.html";
    })
}