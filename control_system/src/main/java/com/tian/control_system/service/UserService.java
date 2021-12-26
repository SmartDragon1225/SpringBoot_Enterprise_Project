package com.tian.control_system.service;


import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pojo.User;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface UserService{

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);

    User toLogin(String username,String password);

    /**
     * 修改用户密码
     * @param userId
     * @param password
     */
    int updatePwd(Integer userId,String password);

}
