package com.tian.springboot_mysely.service.impl;


import com.tian.springboot_mysely.mapper.StudentDao;
import com.tian.springboot_mysely.mapper.UserDao;
import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.pojo.User;
import com.tian.springboot_mysely.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Package: com.tian.springbootlogin.service.impl
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:01
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Service
public class UserServiveImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private StudentDao studentDao;
    @Resource
    private RedisTemplate<String, Student> redisTemplate;

    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public int register(User user) {
        return userDao.register(user);
    }

    @Override
    public void modify(Student student) {
        redisTemplate.opsForValue().set(student.getName(),student);
    }

    @Override
    public boolean submit(Student student) {
        if(Boolean.TRUE.equals(redisTemplate.hasKey(student.getName()))){
            Student o = redisTemplate.opsForValue().get(student.getName());
            studentDao.updateById(o);
            redisTemplate.delete(student.getName());
            return true;
        }else {
            studentDao.updateById(student);
            return true;
        }
    }

}
