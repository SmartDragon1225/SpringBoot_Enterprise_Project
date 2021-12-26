package com.tian.control_system.common.service;



import com.tian.control_system.common.BaseUser;

import java.util.Set;

/**
 * 必须实现的用户service，用于shiro权限验证
 * @author Wenqiang Yang
 * @date 2017/12/10
 */
public interface BaseUserService {
    /**
     * 通过手机号码查找用户
     * @param user
     * @return
     */
    BaseUser findByPhone(String user);
    /**
     * 所有角色
     * @return
     */
    Set<String> getRoles(Integer userId);

    /**
     * 所有权限值
     * @return
     */
    Set<String> getPermissions(Integer userId);

    /**
     * 登录成功做的操作，暂时更改ip，最后登录时间
     * @param username
     */
    void loginSuccess(String username, String host);

}
