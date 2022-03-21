package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.yandong.entity.CourseComment;

import java.util.List;

/**
 * 课程留言表(CourseComment)表数据库访问层
 *
 * @author yandong
 * @since 2022-03-18 14:16:34
 */
@Repository
public interface CourseCommentDao {

    /**
     * 添加留言
     *
     * @param comment 留言对象
     * @return 添加成功返回true，否则返回false
     */
    public Integer saveComment(CourseComment comment);

    /**
     * 留言的分页查询
     * @param courseid 课程id
     * @param offset 数据偏移
     * @param pageSize 每页条数
     * @return 留言集合
     */
    public List<CourseComment> getCommentsByCourseId(@Param("courseid") Integer courseid, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

}

