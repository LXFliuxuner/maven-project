package com.itheima;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName DemoTest
 * @Description TODO
 * @Author 86187
 * @DATE 2022/5/10 15:39
 * @Version 1.0
 */

public class DemoTest {
    @Test
    public void testSay(){
        Demo d=new Demo();
        String ret=d.say("itheima");
        Assert.assertEquals("hello itheima",ret);
    }
}
