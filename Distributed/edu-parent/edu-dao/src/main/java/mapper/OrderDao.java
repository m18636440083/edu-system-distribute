package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yandong.entity.UserCourseOrder;

import java.util.List;

@Repository
public interface OrderDao {

    /**
     * 添加订单
     * @param orderNo 订单编号
     * @param user_id 用户id
     * @param course_id 课程id
     * @param activity_course_id 活动课程id
     * @param source_type 订单来源
     */
    public void saveOrder(@Param("orderNo") String orderNo, @Param("user_id") String user_id, @Param("course_id") String course_id, @Param("activity_course_id") String activity_course_id, @Param("source_type") String source_type);


    /**
     * 修改课程状态
     * @param orderNo 订单编号
     * @param status 订单状态
     * @return 修改成功返回1，修改失败返回0
     */
    public Integer updateOrder(@Param("orderNo") String orderNo,@Param("status") int status);

    /**
     * 删除订单
     * @param orderNo 订单编号
     * @return 删除成功返回1，删除失败返回0
     */
    public Integer deleteOrder(@Param("orderNo") String orderNo);

    /**
     * 根据用户id查询订单信息
     * @param userId 用户ID
     * @return 查询到的订单信息
     */
    public List<UserCourseOrder> getOrdersByUserId(@Param("userId") String userId);
}
