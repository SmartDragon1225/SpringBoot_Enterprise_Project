/**
 * 加载layui日期插件
 * @param elem id字符串
 * @param format 日期格式
 * @param type 日期类型--->不知道可以去 http://www.layui.com/doc/modules/laydate.html
 */
function loadLayuiDate(elem,format,type) {
    if(laydate==undefined||laydate==null) console.error("请引入laydate.js文件");
    laydate.render({
        elem: elem //指定元素
        ,format:format
        ,type: type
    });
}

/**
 * layui文件上传
 * @param upload layui的upload对象
 * @param uploadElem 上传文件的元素
 * @param callback 回调方法 function(obj){}
 */
function loadLayuiFileUpload(upload, uploadElem, callback) {
    var uploadObj = upload.render({
        elem: uploadElem,
        accept: 'file',
        multiple: true,
        auto: false,
        choose: callback
    });
    return uploadObj;
}

/**
 * 删除弹出层
 *
 * @param callback 确认删除回调
 */
function removeDialog(callback) {
    layer.confirm('是否确认删除', {icon: 3, title: '提示'}, function (index) {
        layer.close(index);
        callback();
    });
}
