package org.yandong.service;

import org.yandong.entity.CourseComment;

import java.util.List;

public interface CourseCommentService {

    /**
     * 添加留言
     * @param comment 留言对象
     * @return 添加成功返回true，否则返回false
     */
    public Integer saveComment(CourseComment comment);


    public List<CourseComment> getCommentsByCourseId(Integer courseid, Integer offset, Integer pageSize);
}
