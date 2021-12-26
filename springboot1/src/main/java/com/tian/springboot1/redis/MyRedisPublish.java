package com.tian.springboot1.redis;

import redis.clients.jedis.Jedis;

/**
 * Package: com.tian.springboot1.redis
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/11/15 10:58
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class MyRedisPublish {
    public static void main(String[] args) {
        // 创建Jedis
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.publish("chanel1", "发送message1");
        jedis.publish("chanel2", "发送message2");
        jedis.publish("chanel3", "发送message3");
        System.out.println("发布消息完毕....");
    }
}
