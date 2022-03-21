package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.yandong.entity.Course;

import java.util.List;

@Repository
public interface CourseDao {

    /**
     * 查询全部课程信息
     * @return
     */
    public List<Course> getAllCourse();

    /**
     * 用户登录查询已购课程
     * @param userId
     * @return 查询到的课程信息
     */
    public List<Course> getCourseByUserId(@Param("userId") String userId);

    /**
     * 根据课程id查询课程的详细信息
     * @param courseid 课程id
     * @return 查询到的课程详细信息
     */
    public Course getCourseById(@Param("courseid") Integer courseid);
}
