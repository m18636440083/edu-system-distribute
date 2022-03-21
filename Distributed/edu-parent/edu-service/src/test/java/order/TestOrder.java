package order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.UserCourseOrder;
import org.yandong.service.OrderService;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestOrder {

    @Autowired
    private OrderService orderService;

//    @Test
//    public void TestSaveOrder() {
//        String orderNo = UUID.randomUUID().toString();
//        String user_id = "100030011";
//        String course_id = "7";
//        String activity_course_id = "0"; // 0表示，本课程没有活动
//        String source_type = "1";
//        orderService.saveOrder(orderNo, user_id, course_id, activity_course_id, source_type);
//    }

//    @Test
//    public void updateOrder() {
//        Integer integer = orderService.updateOrder("3ebed13c-2b96-458e-b125-392964ae8877", 20);
//        System.out.println(integer);
//    }

//    @Test
//    public void deleteOrder() {
//        Integer integer = orderService.deleteOrder("3ebed13c-2b96-458e-b125-392964ae8877");
//        System.out.println(integer);
//    }

    @Test
    public void getOrdersByUserId() {
        List<UserCourseOrder> ordersByUserId = orderService.getOrdersByUserId("100030018");
        System.out.println(ordersByUserId);
    }
}
