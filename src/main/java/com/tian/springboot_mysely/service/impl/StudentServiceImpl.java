package com.tian.springboot_mysely.service.impl;



import com.tian.springboot_mysely.mapper.StudentDao;
import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> list() {
        return studentDao.list();
    }

    @Override
    public Student select(int id) {
        Student student = studentDao.slectById(id);
        if(student == null){
            return null;
        }
        return studentDao.slectById(id);
    }

    @Override
    public int add(Student student) {
        if(studentDao.slectById(student.getId())!=null){
            return 0;
        }
        return studentDao.add(student);
    }

    @Override
    public int delete(int id) {
        if(studentDao.slectById(id)==null){
            return 0;
        }
        return studentDao.delete(id);
    }

    @Override
    public int update(Student student) {
        if(studentDao.slectById(student.getId())==null){
            return 0;
        }
        return studentDao.update(student);
    }

    @Override
    public Student login(int id, String name) {
        return studentDao.login(id,name);
    }
}
