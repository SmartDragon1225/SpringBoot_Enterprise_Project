package com.tian.springboot_mysely.mapper;


import com.tian.springboot_mysely.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Package: com.tian.springbootlogin.mapper
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 18:56
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Mapper
public interface UserDao {
    //登录
    //@Select("select * from user where username = #{username} and password = #{password}")
    User login(@RequestParam("username") String username,
               @RequestParam("password") String password);
    //注册用户
    //@Insert("insert into user value (#{id},#{username},#{password})")
    int register(User user);
}
