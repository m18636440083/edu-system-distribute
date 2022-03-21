package user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.User;
import org.yandong.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestUser {

    @Autowired
    private UserService userService;

    @Test
    public void login() {
        User user = userService.login("110", "123");
        System.out.println("用户信息为" + user);
    }

    @Test
    public void checkPhone() {
        Integer integer = userService.checkPhone("1110");
        System.out.println(integer);
    }

    @Test
    public void register() {
        Integer register = userService.register("110", "123");
        System.out.println(register);
    }
}
