package CourseComment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.CourseComment;
import org.yandong.service.CourseCommentService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestComment {

    @Autowired
    private CourseCommentService courseCommentService;

//    @Test
//    public void testSaveComment() {
//        CourseComment comment = new CourseComment();
//        comment.setCourseId(7); // 课程编号
//        comment.setSectionId(8); // 章节编号
//        comment.setLessonId(10); // 小节编号
//        comment.setUserId(100030011); // 用户编号
//        comment.setUserName("1"); // 用户昵称
//        comment.setParentId(0); // 没有父ID
//        comment.setComment("厉害呀厉害呀"); // 留言内容
//        comment.setType(0); // 0：表示用户留言
//        comment.setLastOperator(100030011); // 最后操作的用户编号
//        Integer integer = courseCommentService.saveComment(comment);
//    }
    @Test
    public void getCommentsByCourseId() {
        int pageSize = 20; // 每页显示的条目数
        int pageIndex = 3; // 页码
        List<CourseComment> list = courseCommentService.getCommentsByCourseId(1, (pageIndex - 1) * pageSize, pageSize);
        for (int i = 0; i < list.size(); i++) {
            CourseComment comment = list.get(i);
            System.out.println((i + 1) + "、楼 【" + comment.getUserName() + "】 说：" + comment.getComment());
        }
    }
}
