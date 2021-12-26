layui.use(['layer','form'], function () {
    var form = layui.form;
    var parameter = GetRequest();
    get('/job/getInfoById',{jobId:parameter.id},function (data) {
            deptSelectType("dept",data.department);
            $("#jobId").val(data.job.jobId);
            $("#dept").val(data.job.departmentId);
            $("#jobName").val(data.job.name);
            $("#jobRemark").val(data.job.remark);
            $('input:radio[value='+data.job.status+']').attr('checked','true');
            form.render();
    });
});

//修改
function updateJob() {
    post('/job/updateJob',$("#jobForm").serialize(),function (data) {
        location.href = "./adjust.html";
    })
}