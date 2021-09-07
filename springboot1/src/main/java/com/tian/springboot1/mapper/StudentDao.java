package com.tian.springboot1.mapper;




import com.tian.springboot1.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    //@Select("select * from student")
    List<Student> list();

    List<Student> pageList();//分页查询

    Student slectById(int id);

    int add(Student student);

    int delete(int id);

    int update(Student student);

    //login
    Student login(int id,String name);
}
