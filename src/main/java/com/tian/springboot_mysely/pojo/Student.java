package com.tian.springboot_mysely.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Package: com.tian.springbootlogin.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 19:39
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private Long id;
    private String name;
    private int age;
    private String sex;
    private String place;
    private Date creatTime;
    private Date updataTime;
}
