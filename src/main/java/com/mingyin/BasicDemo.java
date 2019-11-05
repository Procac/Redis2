package com.mingyin;

import redis.clients.jedis.Jedis;

public class BasicDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("123", "456");
        String value = jedis.get("123");
        System.out.println(value);
    }
}
