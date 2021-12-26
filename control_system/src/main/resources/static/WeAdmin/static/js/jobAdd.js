layui.use(['layer','form'], function () {
    var form = layui.form;
    get('/department/getAll',null,function (data) {
        deptSelectType('dept',data);
        form.render();
    });
});

//添加职位
function addJob() {
    post('/job/addJob',$("#jobForm").serialize(),function (data) {
       layer.msg(data);
    })
}