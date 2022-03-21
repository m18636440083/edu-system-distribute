package org.yandong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import mapper.CourseCommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.yandong.entity.CourseComment;
import org.yandong.service.CourseCommentService;

import java.util.List;

@Service
public class CourseCommentServiceImpl implements CourseCommentService {

    @Autowired
    private CourseCommentDao courseCommentDao;
    @Override
    public Integer saveComment(CourseComment comment) {
        return courseCommentDao.saveComment(comment);
    }

    @Override
    public List<CourseComment> getCommentsByCourseId(Integer courseid, Integer offset, Integer pageSize) {
        return courseCommentDao.getCommentsByCourseId(courseid, offset, pageSize);
    }
}
