package com.tian.control_system.service;




import com.tian.control_system.common.BaseUser;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.common.service.BaseService;
import com.tian.control_system.pojo.Document;
import com.tian.control_system.pojo.vo.DocumentVo;

import java.util.List;
import java.util.Set;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
public interface DocumentService{

    Page<List<DocumentVo>> findAllByPage(Page page, String start, String end);

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
