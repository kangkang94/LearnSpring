package util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kang on 17/10/2.
 */
public class MathTest {

    @Test
    public void factorial() throws Exception {

        assertEquals(120,new Math().factorial(5));
    }

    @Test
    public void fibonacci() throws Exception {

        assertEquals(21,new Math().fibonacci(9));
    }

    //测试方法是否抛出异常
    @Test(expected = Exception.class)
    public void testException() throws Exception {

        new Math().factorial(-1);

        fail("传入负数却没有抛出异常");

    }

}