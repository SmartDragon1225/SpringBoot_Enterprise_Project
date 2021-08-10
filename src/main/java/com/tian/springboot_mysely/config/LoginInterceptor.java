package com.tian.springboot_mysely.config;

import com.tian.springboot_mysely.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Package: com.tian.springboot_mysely.config
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/10 8:54
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
        User user = (User) request.getSession().getAttribute("username");
        if(user == null){
            return true;
        }
        request.getRequestDispatcher("登录页面").forward(request,response);
        return false;//如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
        //如果设置为true时，请求将会继续执行后面的操作
    }
}
