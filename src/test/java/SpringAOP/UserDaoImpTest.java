package SpringAOP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.UnitTestBase;

import static org.junit.Assert.*;

/**
 * Created by kang on 17/10/4.
 */

@RunWith(BlockJUnit4ClassRunner.class)

public class UserDaoImpTest extends UnitTestBase{
public UserDaoImpTest() {
        super("classpath*:spring-aspectj.xml");
    }

    @Test
    public void testSay() {
        //通过xml配置的方式取得对象
        UserDao oneInterface = super.getBean("userDaos");
        oneInterface.addUser();
    }}