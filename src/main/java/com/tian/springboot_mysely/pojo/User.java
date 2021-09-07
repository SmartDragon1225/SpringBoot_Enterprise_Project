package com.tian.springboot_mysely.pojo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Package: com.tian.springbootlogin.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/17 18:54
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String username;
    private String password;

    /*static public  void main(String[] args) {
        System.out.println("d");
        a("{d:2,f:3}");
        String d = "{d:2,f:3}";
        String da = JSONObject.parseObject(d).getString("d");
        System.out.println(!da.isEmpty());
        Date data = new Date();
        String simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data);
        System.out.println(simpleDateFormat);System.out.println(0.00==0);
        double a = 0.00D;
        String b = "0.00";
        JSONObject e = new JSONObject();
        e.put("a","恢复");
        System.out.println(e);
        System.out.println(Double.parseDouble(b) == 0);
        System.out.println(object());
    }*/

    public static void a(String map){
        JSONObject n = new JSONObject();
        System.out.println(JSONObject.parseObject(map).get("d").toString());
        System.out.println(JSONObject.parseObject(map).getString("f").toString());
        System.out.println(0.00==0);
    }

    public static JSONObject object(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","年后");
        jsonObject.put("b","年后");
        jsonObject.put("c","年后");
        jsonObject.put("d","年后");
        return jsonObject;
    }

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1","1");
        JSONArray array = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("a","1");
        jsonObject1.put("b","2");
        jsonObject1.put("c","3");
        jsonObject1.put("d","4");
        array.add(jsonObject1);
        JSONArray array1 = new JSONArray();
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("a","1");
        jsonObject2.put("b","2");
        jsonObject2.put("c","3");
        jsonObject2.put("d","4");
        array1.add(jsonObject2);
        //jsonObject.put("array",array);
        ArrayList<Object> list = new ArrayList<>();
        list.add(array);
        list.add(array1);
        jsonObject.put("array",list);
        System.out.println(jsonObject.toJSONString());
        System.out.println(array);
        System.out.println(jsonObject.getString("array").toCharArray());
        //jsonObject.put("array",array);
        //jsonObject.put("array",array1);
        array.add(jsonObject2);
        jsonObject.put("array",array);
        System.out.println(jsonObject.toJSONString());
    }
}
