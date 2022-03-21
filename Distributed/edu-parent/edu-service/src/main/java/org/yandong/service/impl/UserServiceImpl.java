package org.yandong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.yandong.entity.User;
import org.yandong.service.UserService;
/**
 * 用户表(User)表服务实现类
 *
 * @author yandong
 * @since 2022-03-13 11:57:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String phone, String password) {
        return userDao.login(phone, password);
    }

    public Integer checkPhone(String phone) {
        return userDao.checkPhone(phone);
    }

    public Integer register(String phone, String password) {
        return userDao.register(phone, password);
    }
}
