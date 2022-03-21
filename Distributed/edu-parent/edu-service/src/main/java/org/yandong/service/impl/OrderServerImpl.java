package org.yandong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import mapper.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.yandong.entity.UserCourseOrder;
import org.yandong.service.OrderService;

import java.util.List;

@Service
public class OrderServerImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Override
    public void saveOrder(String orderNo, String user_id, String course_id, String activity_course_id, String source_type) {
        orderDao.saveOrder(orderNo, user_id, course_id, activity_course_id, source_type);
    }

    @Override
    public Integer updateOrder(String orderNo, int status) {
        return orderDao.updateOrder(orderNo, status);
    }

    @Override
    public Integer deleteOrder(String orderNo) {
        return orderDao.deleteOrder(orderNo);
    }

    @Override
    public List<UserCourseOrder> getOrdersByUserId(String userId) {
        return orderDao.getOrdersByUserId(userId);
    }
}
