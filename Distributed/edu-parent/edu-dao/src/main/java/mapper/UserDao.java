package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.yandong.entity.Course;
import org.yandong.entity.User;

import java.util.List;

/**
 * 用户表(User)表数据库访问层
 *
 * @author yandong
 * @since 2022-03-13 11:57:07
 */
@Repository
public interface UserDao {

    /**
     * 登录功能
     *
     * @param phone    手机号
     * @param password 密码
     * @return 查询到的User对象
     */
    public User login(@Param("phone") String phone, @Param("password") String password);

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

