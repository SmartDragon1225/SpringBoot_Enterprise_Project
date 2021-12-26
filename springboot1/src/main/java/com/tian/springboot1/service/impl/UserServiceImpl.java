package com.tian.springboot1.service.impl;

import com.tian.springboot1.mapper.UserDao;
import com.tian.springboot1.pojo.User;
import com.tian.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.tian.springboot1.service.impl
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 10:20
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public List<User> select(User user) {
        return userDao.select(user);
    }
}
