layui.use(['layer','form'], function () {
    //获取本地缓存数据
    var user = JSON.parse(localStorage.getItem("user"));
    get("/user/getUserInfo",{uid:user.uid},function (data) {
        $("#userId").val(data.uid);
        $("#username").val(data.username);
        $("#password").val(data.password);
    });
});
//修改密码
function updatePwd() {
    post('/user/updatePasswd',{userId:$("#userId").val(),password:$("#password").val()},function (data) {
        layer.msg(data);
    })
}