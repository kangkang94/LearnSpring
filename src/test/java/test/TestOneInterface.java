package test;

import interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by kang on 17/10/1.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testSay() {
        //通过xml配置的方式取得对象
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.say("This is a test.");
    }
}
