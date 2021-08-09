package com.tian.springboot_mysely.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Package: com.tian.springboot_mysely.common
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/9 9:49
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */

@AllArgsConstructor
@NoArgsConstructor
public enum ResponserEnum {

    //根据业务需求来定义
    SUCCESS(200,"成功"),
    EXCEPTION(201,"未知异常"),
    RUNTIME_EXCEPTION(202,"运行时异常"),
    Null_Pointer_Exception(203,"空指针异常"),
    NOT_FIND(204,"传入的参数为空！"),
    NOT_UNIQUE(205,"用户已存在！");

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
