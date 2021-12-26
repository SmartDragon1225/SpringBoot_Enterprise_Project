package com.tian.springboot1.service;

import com.tian.springboot1.pojo.User;

import java.util.List;

/**
 * Package: com.tian.springboot1.service
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 10:19
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public interface UserService {

    List<User> list();

    List<User> select(User user);
}
