package com.zpjeck;

import redis.clients.jedis.Jedis;

import javax.naming.Name;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Auther: Zpjeck
 * @Date: 2019/7/11 16:50
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("39.108.164.99");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());

        jedis.set("name","first");
        System.out.println(jedis.type("name"));
        jedis.lpush("list","1");
        jedis.lpush("list","2");
        jedis.lpush("list","3");
        jedis.lpush("list","4");
        List list = jedis.lrange("list",0,3);
        System.out.println(jedis.lrange("list",0,3));
        System.out.println(list.toString());

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }

}
