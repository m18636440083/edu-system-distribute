package order;

import mapper.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestOrder {

    @Autowired
    private OrderDao orderDao;

//    @Test
//    public void saveOrder() {
//        String orderNo = UUID.randomUUID().toString();
//        String user_id = "100030011";
//        String course_id = "7";
//        String activity_course_id = "0"; // 0表示，本课程没有活动
//        String source_type = "1";
//        orderDao.saveOrder(orderNo, user_id, course_id, activity_course_id, source_type);
//    }


}
