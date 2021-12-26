package com.tian.control_system.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.tian.springboot_mysely.common
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/9 9:48
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//相应服务
public class ResponseServer {

    private Integer code; //code码
    private String message;//提示信息
    private Object data;//数据存放

    //把枚举放入到实体中(error)
    public static ResponseServer error(ResponserEnum responserEnum){
        return new ResponseServer(responserEnum.getCode(),responserEnum.getMessage(),null);
    }

    public static ResponseServer error(int code,String message){
        return new ResponseServer(code,message,null);
    }

    //success的方法(无参)
    public static ResponseServer success(){
        return new ResponseServer(ResponserEnum.SUCCESS.getCode(), ResponserEnum.SUCCESS.getMessage(),null);
    }

    //success的方法(有参)
    public static ResponseServer success(Object data){
        return new ResponseServer(ResponserEnum.SUCCESS.getCode(), ResponserEnum.SUCCESS.getMessage(), data);
    }

    //把枚举放入到实体中(success)
    public static ResponseServer success(ResponserEnum responserEnum){
        return new ResponseServer(responserEnum.getCode(),responserEnum.getMessage(),null);
    }

}
