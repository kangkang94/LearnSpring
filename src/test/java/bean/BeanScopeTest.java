package bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.UnitTestBase;

import static org.junit.Assert.*;

/**
 * Created by kang on 17/10/2.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase{

    public BeanScopeTest() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void say() throws Exception {

        BeanScope beanScope1 = super.getBean("beanScope");
        beanScope1.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();

    }

}