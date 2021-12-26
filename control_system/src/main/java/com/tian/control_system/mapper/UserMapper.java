package com.tian.control_system.mapper;

import com.tian.control_system.common.mapper.BaseMapper;
import com.tian.control_system.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tianhong yu
 * @date 2018年04月27日上午10:22:25
 */
@Mapper
//@Component(value = "userMapper")
public interface UserMapper{

    /**
     * 登录
     * @param user
     * @return
     */
    User login(@Param(value = "user") User user);

    User toLogin(@Param(value = "username") String username,
                 @Param(value = "password") String password);

    //更新密码
    int updatePwd(@Param(value = "userId") Integer userId,
                   @Param(value = "password") String password);
    @Select("select * from t_user where uid = #{uid}")
    User select(int id);

}
