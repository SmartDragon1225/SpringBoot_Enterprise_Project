package com.tian.springboot_mysely.service.impl;


import com.tian.springboot_mysely.mapper.UserDao;
import com.tian.springboot_mysely.pojo.User;
import com.tian.springboot_mysely.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    UserDao userDao;
    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }
}
