package com.tian.springboot1.service;





import com.tian.springboot1.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Package: com.tian.lastspringboot.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/6 8:20
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public interface StudentService {

    List<Student> list();
    //PageEntity pageList(Integer page, Integer rows);

    Student select(int id);

    int add(Student student);//平时开发
    void add(Map map);//企业开发

    int delete(int id);

    int update(Student student);//平时开发
    void update(Map map);//企业开发

    Student login(int id,String name);
}
