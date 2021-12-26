
/***获取url中的参数***/
function getUrlParam(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); /***构造一个含有目标参数的正则表达式对象***/
	var r = window.location.search.substr(1).match(reg);  /***匹配目标参数***/
	if (r != null) return unescape(r[2]); return null; /***返回参数值***/
}

/**
 * 处理请求结果
 * @param data  			请求返回数据
 * @param isAlert			是否弹出错误信息,true:弹出,false:不弹出
 * @returns                返回true:成功,false：失败
 */
function handleResult(data) {
    if(data.respCode=== 0)
	{
		return true;
	}else if(data.respCode === -1){
        location.href='login.html';
        return false;
    }
	alert(data.respMsg);
    return false;
}

/**
 * 格式化时间，含时分秒
 * @param date
 * @returns {string}
 */
function formatTime2Long(date) {
    if(date.getTime() === new Date(null).getTime()){
        return "";
    }
    var datetime = date.getFullYear()
        + "年"// "年"
        + ((date.getMonth() + 1) >= 10 ? (date.getMonth() + 1) : "0"
            + (date.getMonth() + 1))
        + "月"// "月"
        + (date.getDate() < 10 ? "0" + date.getDate() : date
            .getDate())
        + "日 "
        + (date.getHours() < 10 ? "0" + date.getHours() : date
            .getHours())
        + ":"
        + (date.getMinutes() < 10 ? "0" + date.getMinutes() : date
            .getMinutes())
        + ":"
        + (date.getSeconds() < 10 ? "0" + date.getSeconds() : date
            .getSeconds());
    return datetime;
}
/**
 * 格式化时间，含时分秒,以-分隔
 * @param date
 * @returns {string}
 */
function formatTime2Short1(date) {
    if(date.getTime() === new Date(null).getTime()){
        return "";
    }
    var datetime = date.getFullYear()
        + "-"// "年"
        + ((date.getMonth() + 1) >= 10 ? (date.getMonth() + 1) : "0"
            + (date.getMonth() + 1))
        + "-"// "月"
        + (date.getDate() < 10 ? "0" + date.getDate() : date
            .getDate());
    return datetime;
}
/**
 * 格式化时间，不含时分秒
 * @param date
 * @returns {string}
 */
function formatTime2Short(date) {
    if(date.getTime() === new Date(null).getTime()){
        return "";
    }
    var datetime = date.getFullYear()
        + "年"// "年"
        + ((date.getMonth() + 1) >= 10 ? (date.getMonth() + 1) : "0"
            + (date.getMonth() + 1))
        + "月"// "月"
        + (date.getDate() < 10 ? "0" + date.getDate() : date
            .getDate()) + "日";
    return datetime;
}
/**
 * 加载类型(适合字典表)
 * @param selectData
 */
function selectType(id,selectData) {
    var option = '<option>请选择</option>';
    $.each(selectData, function (i, v) {
        option += '<option value="' + v.value + '">';
        option += v.name;
        option += '</option>'
    });
    $('#' + id).empty();
    $('#' + id).append(option);
}

/**
 * 加载类型(部门)
 * @param selectData
 */
function deptSelectType(id,selectData) {
    var option = '';
    $.each(selectData, function (i, v) {
        option += '<option value="' + v.departmentId + '">';
        option += v.name;
        option += '</option>'
    });
    $('#'+id).append(option);
}
/**
 * 加载类型(职位)
 * @param selectData
 */
function jobSelectType(id,selectData) {
    var option = '<option>请选择职位</option>';
    $.each(selectData, function (i, v) {
        option += '<option value="' + v.jobId + '">';
        option += v.name;
        option += '</option>'
    });
    $('#' + id).empty();
    $('#'+id).append(option);
}
/**
 * get请求
 * @param url
 * @param params
 * @param callback
 * @param async
 * @returns {*}
 */
function get(url, params, callback, async){
    // 设定最长等待10秒
    var index;
    if (!async) {
        async = true;
    }
    $.ajax({
        type:'get',
        url:url,
        data:params,
        dataType:"json",
        async:async,
        beforeSend:function(){
            // 进度条
           index = layer.load(1);
        },
        success:function(data) {
            if(handleResult(data)){
                callback(data.data)
                layer.close(index);
            }else{
                layer.close(index);
            }
        },
        error : function(xml) {
            layer.close(index);
        }
    });
}
/**
 * post请求,不包含文件请求
 * @param url
 * @param params
 * @param callback
 * @param async
 * @returns {*}
 */
function post(url, params, callback, async){
    // 设定最长等待10秒
    var index;
    if (!async) {
        async = true;
    }
    $.ajax({
        type:'post',
        url:url,
        data:params,
        dataType: "json",
        async:async,
        beforeSend:function(){
            // 进度条
            index = layer.load(1);
        },
        success:function(data) {
            if(handleResult(data)){
                callback(data.data)
                layer.close(index);
            }else{
                layer.close(index);
            }
        },
        error : function(xml) {
            layer.close(index);
        }
    });
}
/**
 * post请求,包含文件请求
 * @param url
 * @param params
 * @param callback
 * @param async
 * @returns {*}
 */
function postFile(url, params, callback, async){
    // 设定最长等待10秒
    var index;
    if (!async) {
        async = true;
    }
    $.ajax({
        type:'post',
        url:url,
        data:params,
        async:async,
        processData:false,
        contentType:false,
        dataType: "json",
        beforeSend:function(){
            // 进度条
            index = layer.load(1);
        },
        success:function(data) {
            if(handleResult(data)){
                callback(data.data)
                layer.close(index);
            }else {
                layer.close(index);
            }
        },
        error : function(xml) {
            layer.close(index);
        }
    });
}