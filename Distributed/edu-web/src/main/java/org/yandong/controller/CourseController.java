package org.yandong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yandong.entity.Course;
import org.yandong.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Reference
    public CourseService courseService;

    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse() {
        List<Course> allCourse = courseService.getAllCourse();
        return allCourse;
    }

    @GetMapping("getCourseByUserId/{userid}")
    public List<Course> getCourseByUserId(@PathVariable("userid") String userid) {
        List<Course> list = courseService.getCourseByUserId(userid);
        return list;
    }

    @GetMapping("getCourseById/{courseid}")
    public Course getCourseById(@PathVariable("courseid") Integer courseid) {
        Course course = courseService.getCourseById(courseid);
        return course;
    }

}
