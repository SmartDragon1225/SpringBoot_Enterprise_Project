package com.tian.springboot_mysely.service;





import com.tian.springboot_mysely.pojo.Student;

import java.util.List;

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

    Student select(int id);

    int add(Student student);

    int delete(int id);

    int update(Student student);

    Student login(int id,String name);
}
