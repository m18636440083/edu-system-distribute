package course;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.entity.Course;
import org.yandong.service.CourseService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestCourse {
    @Autowired
    private CourseService courseService;

    @Test
    public void getAll() {
        List<Course> allCourse = courseService.getAllCourse();
        for (Course course : allCourse) {
            System.out.println(course);
        }
    }

    @Test
    public void getCourseByUserId() {
        List<Course> courseByUserId = courseService.getCourseByUserId("100030017");
        for (Course course : courseByUserId) {
            System.out.println(course);
        }
    }

    @Test
    public void getCourseById() {
        Course courseById = courseService.getCourseById(7);
        System.out.println(courseById);
    }
}
