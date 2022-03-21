package org.yandong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yandong.entity.User;
import org.yandong.entity.UserVO;
import org.yandong.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    public UserService userService;
    @GetMapping("login")
    public UserVO login(String phone, String password) {
        UserVO userVO = new UserVO();
        User user = null;
        int integer = userService.checkPhone(phone);
        if (integer == 0) {
            userService.register(phone, password);
            user = userService.login(phone, password);
            userVO.setState(100);
            userVO.setMessage("注册成功");
            userVO.setContent(user);
        } else {
            user = userService.login(phone, password);
            if (user != null) {
                userVO.setState(200);
                userVO.setMessage("登陆成功");
                userVO.setContent(user);
            } else {
                userVO.setState(300);
                userVO.setMessage("登陆失败");
                userVO.setContent(null);
            }
        }
        return userVO;
    }
}
