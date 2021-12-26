layui.use(['layer','form'], function () {
    var form = layui.form;
    var parameter = GetRequest();
    var id = parameter.id;
    get('/employee/getStatusById',{id:parameter.id},function (data) {
        selectType('status',data.status);
        $("#employeeId").val(id);
        $("#name").val(data.employee.name);
        $("#status").val(data.employee.status);
        form.render();
    })
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

//更改在职状态
function updateStatus() {
    post('/employee/updateStatus',$("#statusForm").serialize(),function () {
        location.href = './statusAdjust.html';
    })
}