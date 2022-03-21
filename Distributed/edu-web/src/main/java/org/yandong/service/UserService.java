package org.yandong.service;


import org.apache.ibatis.annotations.Param;
import org.yandong.entity.User;

public interface UserService {

    public User login(String phone, String password);

    public Integer checkPhone(String phone);

    public Integer register(String phone, String password);
}
