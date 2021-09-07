package com.tian.springboot1.service.impl;


import com.tian.springboot1.mapper.StudentDao;
import com.tian.springboot1.pojo.Student;
import com.tian.springboot1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> list() {
        return studentDao.list();
    }

    /*@Override
    public PageEntity pageList(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<Student> list = studentDao.pageList();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        PageEntity pageEntity = new PageEntity();
        pageEntity.setPageList(pageInfo.getList());
        pageEntity.setTotal(pageInfo.getTotal());
        return pageEntity;
    }*/

    @Override
    public Student select(int id) {
        Student student = studentDao.slectById(id);
        if(student == null){
            return null;
        }
        return studentDao.slectById(id);
    }

    @Override
    //一般开发
    public int add(Student student) {
        if(studentDao.slectById(student.getId())!=null){
            return 0;
        }
        return studentDao.add(student);
    }

    @Override
    //企业开发
    public void add(Map map) {
        Student student = new Student();
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("id")))){
            student.setId((Integer) map.get("id"));
        }
        if(!StringUtils.isEmpty((String)map.get("name"))){
            student.setName((String) map.get("name"));
        }
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("age")))){
            student.setAge((Integer) map.get("age"));
        }
        if(!StringUtils.isEmpty((String)map.get("sex"))){
            student.setSex((String) map.get("sex"));
        }
        if(!StringUtils.isEmpty((String)map.get("place"))){
            student.setName((String) map.get("place"));
        }
        //设置创建时间
        if(!StringUtils.isEmpty((String)map.get("creat_time"))){
            String timeStr = (String) map.get("creat_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        //设置时间
        if(!StringUtils.isEmpty((String)map.get("updata_time"))){
            String timeStr = (String) map.get("updata_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        studentDao.add(student);
    }

    @Override
    public int delete(int id) {
        if(studentDao.slectById(id)==null){
            return 0;
        }
        return studentDao.delete(id);
    }

    //一般开发
    @Override
    public int update(Student student) {
        if(studentDao.slectById(student.getId())==null){
            return 0;
        }
        return studentDao.update(student);
    }

    @Override
    public void update(Map map) {
        Student student = new Student();
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("id")))){
            student.setId((Integer) map.get("id"));
        }
        if(!StringUtils.isEmpty((String)map.get("name"))){
            student.setName((String) map.get("name"));
        }
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("age")))){
            student.setAge((Integer) map.get("age"));
        }
        if(!StringUtils.isEmpty((String)map.get("sex"))){
            student.setSex((String) map.get("sex"));
        }
        if(!StringUtils.isEmpty((String)map.get("place"))){
            student.setName((String) map.get("place"));
        }
        //设置创建时间
        if(!StringUtils.isEmpty((String)map.get("creat_time"))){
            String timeStr = (String) map.get("creat_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        //设置时间
        if(!StringUtils.isEmpty((String)map.get("updata_time"))){
            String timeStr = (String) map.get("updata_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        studentDao.update(student);
    }


    @Override
    public Student login(int id, String name) {
        return studentDao.login(id,name);
    }
}
