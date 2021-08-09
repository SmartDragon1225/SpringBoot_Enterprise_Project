package com.tian.springboot_mysely;

import com.tian.springboot_mysely.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringbootMyselyApplicationTests {

    @Autowired
    StudentService studentService;
    @Test
    void contextLoads() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("id",1);
        hashMap.put("name","dd");
        hashMap.put("age",12);
        hashMap.put("sex","男");
        hashMap.put("place","weinan");
        //hashMap.put("creat_time","weinan");
        //hashMap.put("","weinan");
        studentService.add(hashMap);
    }

}
