package org.yandong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yandong.entity.UserCourseOrder;
import org.yandong.service.OrderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("order")
public class OrderController {
    @Reference // 远程消费
    private OrderService orderService;

    @GetMapping("saveOrder/{userid}/{courseid}/{acid}/{stype}")
    public String saveOrder(@PathVariable("userid") String user_id, @PathVariable("courseid") String course_id, @PathVariable("acid") String activity_course_id, @PathVariable("stype") String source_type) {
        String orderNo = UUID.randomUUID().toString();
        orderService.saveOrder(orderNo, user_id, course_id, activity_course_id, source_type);
        return orderNo;
    }

    @GetMapping("updateOrder/{orderno}/{status}")
    public Integer updateOrder(@PathVariable("orderno") String orderno, @PathVariable("status") Integer status) {
        Integer integer = orderService.updateOrder(orderno, status);
        return integer;
    }

    @GetMapping("deleteOrder/{orderno}")
    public Integer deleteOrder(@PathVariable("orderno") String orderno) {
        Integer integer = orderService.deleteOrder(orderno);
        return integer;
    }

    @GetMapping("getOrdersByUserId/{userid}")
    public List<UserCourseOrder> getOrdersByUserId(@PathVariable("userid") String userid) {
        List<UserCourseOrder> list = orderService.getOrdersByUserId(userid);
        return list;
    }
}