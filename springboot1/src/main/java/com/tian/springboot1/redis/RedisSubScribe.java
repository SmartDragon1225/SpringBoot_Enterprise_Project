package com.tian.springboot1.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Package: com.tian.springboot1.redis
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/11/15 10:58
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class RedisSubScribe extends JedisPubSub{
    /**
     * 当订阅者接收到消息时回自动调用改方法 String channel--->频道的名称
     String message--->发布的消息
     */
    @Override
    public void onMessage(String channel, String message) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("我是订阅者:订阅频道[" + channel + "],收到 的消息是:[" + message + "],时间为:[" + df.format(new Date()) + "]");
    }
    public static void main(String[] args) {
       /* // 创建Jedis
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // 创建redisSubScribe对象
        RedisSubScribe redisSubScribe = new RedisSubScribe();
         // 从Redis订阅
        jedis.subscribe(redisSubScribe, "chanel1","chanel2","chanel3");*/
        System.out.println(lengthOfLongestSubstring("abcabcababa"));
    }

    public static int lengthOfLongestSubstring (String s) {
        // write code here
        int arr[] = new int[128];
        init(arr);
        int start = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)] != 1){
                if(arr[s.charAt(i)] >= start){
                    int len = (i-start);
                    if(len > max){
                        max = len;
                    }
                    start = arr[s.charAt(i)] + 1;
                }
            }
            arr[s.charAt(i)] = i;
        }
        if(max < (s.length() - start)){
            max = s.length() - start;
        }
        return max;
    }

    public static void init(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }


    public boolean checkRecord (String s) {
        // write code here
        int start = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                late = 0;
                start++;
                if(start>1){
                    return false;
                }
            }else if(s.charAt(i) == 'L'){
                late++;
                if(late > 2){
                    return false;
                }
            }else {
                late = 0;
            }
        }
        return true;
    }
}
