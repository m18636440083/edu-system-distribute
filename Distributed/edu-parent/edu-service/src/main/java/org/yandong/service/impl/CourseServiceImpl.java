package org.yandong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import mapper.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.yandong.entity.Course;
import org.yandong.service.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public List<Course> getCourseByUserId(String userId) {
        return courseDao.getCourseByUserId(userId);
    }

    @Override
    public Course getCourseById(Integer courseid) {
        return courseDao.getCourseById(courseid);
    }
}
