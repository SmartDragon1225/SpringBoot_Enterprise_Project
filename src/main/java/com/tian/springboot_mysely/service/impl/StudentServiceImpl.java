package com.tian.springboot_mysely.service.impl;



import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tian.springboot_mysely.mapper.StudentDao;
import com.tian.springboot_mysely.pojo.Student;
import com.tian.springboot_mysely.pojo.pageEntity.PageEntity;
import com.tian.springboot_mysely.service.StudentService;
import net.sf.jsqlparser.expression.StringValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Resource
    private RedisTemplate<String,Student> redisTemplate;
    @Override
    public List<Student> list() {
        List<Student> list = studentDao.list();
        for (Student student : list){
            if(Boolean.TRUE.equals(redisTemplate.hasKey(student.getName()))) {
                Student student1 = redisTemplate.opsForValue().get(student.getName());
                assert student1 != null;
                student.setId(student1.getId());
                student.setName(student1.getName());
                student.setAge(student1.getAge());
                student.setSex(student1.getSex());
                student.setCreatTime(student1.getCreatTime());
                student.setUpdataTime(student1.getUpdataTime());
            }
        }
        return list;
    }


    @Override
    public PageEntity pageList(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<Student> list = studentDao.pageList();
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        PageEntity pageEntity = new PageEntity();
        pageEntity.setPageList(pageInfo.getList());
        pageEntity.setTotal(pageInfo.getTotal());
        return pageEntity;
    }

    @Override
    public Student select(String name) {
        /**
         * 判断缓存是否有数据
         */
        if(Boolean.FALSE.equals(redisTemplate.hasKey(name))){
            Student student = studentDao.slectById(name);
            if(student == null){
                return null;
            }
            redisTemplate.opsForValue().set(name, student);
            redisTemplate.expire(name, Duration.ofSeconds(60));
            return studentDao.slectById(name);
        }else {
            return redisTemplate.opsForValue().get(name);
        }
    }

    @Override
    //一般开发
    public int add(Student student) {

        return studentDao.add(student);
    }

    @Override
    //企业开发
    public void add(Map map) {
        Student student = new Student();
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("id")))){
            student.setId((Long) map.get("id"));
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
        /*if(!StringUtils.isEmpty((String)map.get("creat_time"))){
            String timeStr = (String) map.get("creat_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            LocalDateTime date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreatTime(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
*/
        /*//设置时间
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
        }*/
        studentDao.add(student);
    }

    @Override
    public int delete(Long id) {
       /* if(studentDao.slectById(id)==null){
            return 0;
        }*/
        return studentDao.delete(id);
    }

    //一般开发
    @Override
    public int update(Student student) {
        /*if(studentDao.slectById(student.getId())==null){
            return 0;
        }*/
        return studentDao.updateById(student);
    }

    @Override
    public void update(Map map) {
        Student student = new Student();
        if(!StringUtils.isEmpty(String.valueOf((Integer)map.get("id")))){
            student.setId((Long) map.get("id"));
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
        /*if(!StringUtils.isEmpty((String)map.get("creat_time"))){
            String timeStr = (String) map.get("creat_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }*/

        //设置时间
        /*if(!StringUtils.isEmpty((String)map.get("updata_time"))){
            String timeStr = (String) map.get("updata_time");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = simpleDateFormat.parse(timeStr);
                student.setCreat_time(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }*/
        studentDao.updateById(student);
    }


    @Override
    public Student login(int id, String name) {
        return studentDao.login(id,name);
    }
}
