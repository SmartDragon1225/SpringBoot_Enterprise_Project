package com.tian.springboot_mysely.common;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Package: com.tian.springboot_mysely.common
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 9:00
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class HttpTrans {

    public String trans(String trandName){
        HttpClient httpClient = new HttpClient();
        String url = "http://127.0.0.1/student" + trandName;
        PostMethod postMethod = new PostMethod(url);

        postMethod.addRequestHeader("accept", "*/*");
        postMethod.addRequestHeader("connection", "Keep-Alive");
        //设置json格式传送
        postMethod.addRequestHeader("Content-Type", "application/json;charset=utf-8");
        //必须设置下面这个Header
        postMethod.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
        //添加请求参数

        String res = "";
        try {
            int code = httpClient.executeMethod(postMethod);
            if (code == 200){
                res = postMethod.getResponseBodyAsString();
                System.out.println(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 调用接口的方法
     * @param name 拼接路径的名子
     * @return
     */
    public JSONObject getTrans(String name){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://127.0.0.1:8889/" + name;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity r = new HttpEntity(httpHeaders);
        ResponseEntity<String> stringResponseEntity =
                restTemplate.exchange(url, HttpMethod.GET,r,String.class);
        return JSONObject.parseObject(stringResponseEntity.getBody());
    }

    /**
     * 调用接口的方法
     * @param name 路径名
     * @param data 接口入参
     * @return
     */
    public JSONObject getTrans(String name,String data){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://127.0.0.1:8889/" + name;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);//json格式
        HttpEntity r = new HttpEntity(data,httpHeaders);
        ResponseEntity<String> stringResponseEntity =
                restTemplate.exchange(url, HttpMethod.POST,r,String.class);
        return JSONObject.parseObject(stringResponseEntity.getBody());
    }
}
