package org.quwb.utils.rediss;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class RedisUnitTest {
    //测试连接
    @Test
    public void testConn() {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());
    }

    @Test
    public void testString() {
        Jedis jedis = new Jedis("127.0.0.1");
        //jedis.zrangeByScore()
        jedis.set("city", "北京");
        System.out.println("获取String值：" + jedis.get("city"));
    }
}