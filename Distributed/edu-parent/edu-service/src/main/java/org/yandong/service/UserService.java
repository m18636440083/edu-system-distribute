package org.yandong.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.yandong.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author yandong
 * @since 2022-03-13 11:57:13
 */
public interface UserService {
    /**
     * 登录功能
     * @param phone 手机号
     * @param password 密码
     * @return 登录成功返回user对象，登录失败返回null
     */
    public User login(String phone, String password);

    /**
     * 检查手机号是否已经注册
     *
     * @param phone 手机号
     * @return 已经注册返回1， 没有注册返回0
     */
    public Integer checkPhone(String phone);

    /**
     * 用户注册
     *
     * @param phone    手机号
     * @param password 密码
     * @return 受影响的行数
     */
    public Integer register(@Param("phone") String phone, @Param("password") String password);
}
