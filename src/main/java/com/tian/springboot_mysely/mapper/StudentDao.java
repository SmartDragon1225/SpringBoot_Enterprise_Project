package com.tian.springboot_mysely.mapper;



import com.tian.springboot_mysely.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.tian.lastspringboot.dao
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:18
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Mapper
public interface StudentDao {

    List<Student> list();

    Student slectById(int id);

    int add(Student student);

    int delete(int id);

    int update(Student student);

    //login
    Student login(int id,String name);
}
