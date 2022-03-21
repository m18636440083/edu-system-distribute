package CourseCommentFavoriteRecord;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yandong.service.CourseCommentFavoriteRecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestRecord {

    @Autowired
    private CourseCommentFavoriteRecordService courseCommentFavoriteRecordService;

    @Test
    public void saveFavorite() {
        Integer integer = courseCommentFavoriteRecordService.saveFavorite(1, 123);
        System.out.println(integer);
    }

    @Test
    public void cancelFavorite() {
        Integer integer = courseCommentFavoriteRecordService.cancelFavorite(1, 123);
        System.out.println(integer);
    }


}
