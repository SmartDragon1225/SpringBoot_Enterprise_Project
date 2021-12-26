package com.tian.control_system.service;



import com.tian.control_system.common.BaseUser;
import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pageEntity.PageEntity;
import com.tian.control_system.pojo.Dictionary;

import java.util.List;
import java.util.Set;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface DictionaryService{

    //添加
    Integer add(Dictionary dictionary);

    //分页查询
    PageEntity pageList(Integer page,Integer rows);

    List<Dictionary> findEmployeeStatus();

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
