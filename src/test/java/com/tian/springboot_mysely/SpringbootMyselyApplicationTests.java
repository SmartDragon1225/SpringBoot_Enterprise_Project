package com.tian.springboot_mysely;

import com.tian.springboot_mysely.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.HashMap;

@SpringBootTest
class SpringbootMyselyApplicationTests {

    @Autowired
    StudentService studentService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;
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

    @Test
    public void test(){
        /*ValueOperations ops = redisTemplate.opsForValue();
        redisTemplate.opsForGeo();
        ops.set("k1", "xiaohuang");
        Object o = ops.get("k1");*/
        redisTemplate.opsForValue().set("a","long");
        System.out.println(redisTemplate.opsForValue().get("a"));

    }

}
