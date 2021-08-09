package com.tian.springboot_mysely.controller;

import com.tian.springboot_mysely.pojo.User;
import com.tian.springboot_mysely.service.StudentService;
import com.tian.springboot_mysely.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Package: com.tian.springbootlogin.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:05
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StudentService studentService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model){
        User user = userService.login(username, password);
        if(user != null){
            session.setAttribute("username",username);
            return "index";
        }else {
            model.addAttribute("msg","用户名或密码错误！");
            return "login";
        }
    }


    @RequestMapping("/loginout")
    public String loginout(HttpSession session) {
        session.invalidate();
        return "html/index";
    }


}
