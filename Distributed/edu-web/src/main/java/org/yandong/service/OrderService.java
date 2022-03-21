package org.yandong.service;

import org.yandong.entity.UserCourseOrder;

import java.util.List;

public interface OrderService {

    public void saveOrder(String orderNo, String user_id, String course_id, String activity_course_id, String source_type);

    /**
     * 修改课程状态
     * @param orderNo 订单编号
     * @param status 订单状态
     * @return 修改成功返回1，修改失败返回0
     */
    public Integer updateOrder(String orderNo, int status);

    /**
     * 删除订单
     * @param orderNo 订单编号
     * @return 删除成功返回1，删除失败返回0
     */
    public Integer deleteOrder(String orderNo);

    /**
     * 根据用户id查询订单信息
     * @param userId 用户ID
     * @return 查询到的订单信息
     */
    public List<UserCourseOrder> getOrdersByUserId(String userId);
}
