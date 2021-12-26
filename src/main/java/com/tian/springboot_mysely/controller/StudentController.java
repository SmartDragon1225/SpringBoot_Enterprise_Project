package com.tian.springboot_mysely.controller;


import com.tian.springboot_mysely.common.ResponseServer;
import com.tian.springboot_mysely.common.ResponserEnum;
import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.service.UserService;
import com.tian.springboot_mysely.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: com.tian.springbootlogin.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:27
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @RequestMapping("login")
    public String login(){
        return "登录成功！";
    }

    @Autowired
    private StudentServiceImpl studentService;

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public ResponseServer list(){
        HashMap<Object, Object> hashMap = new HashMap<>();
        List<Student> list = studentService.list();
        hashMap.put("students",list);
        return ResponseServer.success(hashMap);
        //return new ResultBean("200","查询成功",hashMap);
    }

    @RequestMapping("/modify")
    public ResponseServer modify(@RequestBody Student student){
        userService.modify(student);
        return ResponseServer.error(200,"缓存成功！");
    }

    @PostMapping ("/submit")
    public ResponseServer submit(@RequestBody Student student){
        boolean submit = userService.submit(student);
        if(!submit){
            return ResponseServer.error(201,"更新失败！");
        }
        return ResponseServer.error(200,"更新成功！");
    }

    @GetMapping("/select")
    public ResponseServer select(@RequestParam("name") String name){
        Student student = studentService.select(name);
        if(student != null){
            return ResponseServer.success(student);
        }else {
            return ResponseServer.error(404,"NOT FIND");
        }
    }

    //至于如何传map,前端的事情！
    @PostMapping("/addstudent")
    public ResponseServer addstudent(Map map){
        if(map == null){
            return ResponseServer.error(ResponserEnum.NOT_FIND);
        }
        //已经存在用户，不能添加
        /*//Student student = studentService.select((Long) map.get("id"));
        System.out.println(student);
        log.info(String.valueOf(student));
        if(StringUtils.isEmpty(student)){
            return ResponseServer.error(ResponserEnum.NOT_UNIQUE);
        }*/
        studentService.add(map);
        return ResponseServer.success();
    }

    //分页查询
    @GetMapping("/pagelist/{page}/{rows}")
    public ResponseServer pagelist(@PathVariable("page") Integer page,
                                   @PathVariable("rows") Integer rows) {
        if(page == null || rows == null){
            return ResponseServer.error(ResponserEnum.NOT_FIND);
        }
        return ResponseServer.success(studentService.pageList(page,rows));
    }
}
