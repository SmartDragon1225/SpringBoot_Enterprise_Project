package com.tian.springboot1.mapper;

import com.tian.springboot1.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.tian.springboot1.mapper
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 10:13
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Mapper
public interface UserDao {

    List<User> list();

    List<User> select(User user);
}
