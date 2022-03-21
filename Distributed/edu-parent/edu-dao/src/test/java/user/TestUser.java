package user;

import mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    public void login() {
        User user = userDao.login("110", "123");
        System.out.println(user);
    }

    @Test
    public void checkPhone() {
        Integer integer = userDao.checkPhone("11001");
        System.out.println(integer);
    }

    @Test
    public void register() {
        Integer register = userDao.register("1101", "123");
        System.out.println(register);
    }
}
