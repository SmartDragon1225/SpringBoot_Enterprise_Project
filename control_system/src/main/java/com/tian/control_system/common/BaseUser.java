package com.tian.control_system.common;

/**
 * @author Wenqiang Yang
 * @date 2017/12/10
 */
public interface BaseUser {
    /**
     * 获取状态
     * @return
     */
    String getStatus();

    /**
     * 获取盐
     * @return
     */
    String getSalt();

    /**
     * 获取密码
     * @return
     */
    String getPassword();

    /**
     * 获取用户id
     * @return
     */
    Integer getUserId();

    /**
     * 获取手机号
     * @return
     */
    String getPhone();
}
