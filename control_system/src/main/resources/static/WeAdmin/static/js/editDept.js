layui.use(['layer','form'], function () {
    var form = layui.form;
    var parameter = GetRequest();
    get('/department/getInfoById',{departmentId:parameter.id},function (data) {
           if (data!=null){
               $("#departmentId").val(data.departmentId);
               $("#name").val(data.name);
               $("#remark").val(data.remark);
               $('input:radio[value='+data.status+']').attr('checked','true');
               form.render();
           }
    });
});

//修改
function updateDept() {
    post('/department/updateDepartment',$("#departmentForm").serialize(),function (data) {
       location.href = "./adjust.html";
    })
}

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