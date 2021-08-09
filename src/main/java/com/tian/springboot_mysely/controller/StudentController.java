package com.tian.springboot_mysely.controller;


import com.tian.springboot_mysely.pojo.ResultBean;
import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Package: com.tian.springbootlogin.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:27
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("login")
    public String login(){
        return "登录成功！";
    }

    @Autowired
    StudentServiceImpl studentService;
    @RequestMapping("/list")
    @ResponseBody
    public ResultBean list(){
        HashMap<Object, Object> hashMap = new HashMap<>();
        List<Student> list = studentService.list();
        hashMap.put("students",list);
        return new ResultBean("200","查询成功",hashMap);
    }
}
