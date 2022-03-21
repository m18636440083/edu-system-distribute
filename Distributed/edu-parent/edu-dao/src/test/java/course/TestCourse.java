package course;

import mapper.CourseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.Course;
import org.yandong.entity.CourseLesson;
import org.yandong.entity.CourseSection;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestCourse {

    @Autowired
    private CourseDao courseDao;

    @Test
    public void getAllCourse() {
        List<Course> list = courseDao.getAllCourse();
        for (Course course : list) {
            //if( course.getId().toString() .equals("8") ){ //查询第8门课
            String flag = course.getActivityCourse() != null ? "【火爆活动 中】" : "";
            System.out.println("课程：" + flag + course.getId() + "->" + course.getCourseName());
            for (CourseSection cs : course.getCourseSections()) {
                System.out.println("\t\t章节" + cs.getId() + "--->" + cs.getSectionName());
                for (CourseLesson cl : cs.getCourseLessons()) {
                    if (cl.getCourseMedia() != null) {
                        System.out.println("\t\t\t小节" + cl.getId() + "--->" + cl.getTheme() + ",视频：" + cl.getCourseMedia().getFileId() + ",时长：【" + cl.getCourseMedia().getDuration() + "】");
                    } else {
                        System.out.println("\t\t\t小节" + cl.getId() + "--->" + cl.getTheme() + ",视频：【待上传】,时长：【00:00】");
                    }
                }
            }
        }
    }

    @Test
    public void getCourseByUserId() {
        List<Course> courseByUserId = courseDao.getCourseByUserId("100030018");
        for (Course course : courseByUserId) {
            System.out.println(course);
        }
    }

    @Test
    public void getCourseById() {
        Course courseById = courseDao.getCourseById(7);
        System.out.println(courseById);
    }
}

