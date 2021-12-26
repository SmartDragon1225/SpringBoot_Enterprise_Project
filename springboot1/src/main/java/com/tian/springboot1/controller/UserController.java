package com.tian.springboot1.controller;

import com.tian.springboot1.common.ResponseServer;
import com.tian.springboot1.pojo.User;
import com.tian.springboot1.service.UserService;
import com.tian.springboot1.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Package: com.tian.springboot1.controller
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 10:18
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    //UserService userService;
    UserServiceImpl userService = new UserServiceImpl();

    @GetMapping("list")
    public ResponseServer select(@RequestParam("username")String username,
                                 @RequestParam("password")String password){
        User user = new User();
        if(username.equals("")){
            user.setUsername(username);
        }else {
            user.setUsername(null);
        }
        if(password.equals("")){
            user.setPassword(password);
        }else {
            user.setPassword(null);
        }
        List<User> users = userService.select(user);
        return ResponseServer.success(users);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
