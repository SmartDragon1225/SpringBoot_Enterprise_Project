package com.tian.springboot_mysely.service;


import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.pojo.User;

/**
 * Package: com.tian.springbootlogin.service
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:00
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public interface UserService {
    User login(String username, String password);
    int register(User user);

    /**
     * 放入缓存 库里数据不变
     * @param student
     */
    void modify(Student student);

    /**
     * 提交操作 库里数据改变
     * @param student
     */
    boolean submit(Student student);
}
