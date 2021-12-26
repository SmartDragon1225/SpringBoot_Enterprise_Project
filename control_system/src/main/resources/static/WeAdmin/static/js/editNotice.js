layui.use(['layer','form','util'], function () {
    var form = layui.form;
    var parameter = GetRequest();
    var util = layui.util;
    get('/notice/getNoticeInfoById',{id:parameter.id},function (data) {
        $("#noticeId").val(data.noticeId);
        $("#title").val(data.title);
        $("#content").val(data.content);
        $("#end").val(util.toDateString(data.activeTime,'yyyy-MM-dd'));
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

//修改
function updateNotice() {
    post('/notice/updateNotice',$("#noticeForm").serialize(),function () {
        location.href = "./adjust.html";
    })
}