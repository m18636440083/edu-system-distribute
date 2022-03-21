package org.yandong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yandong.entity.CourseComment;
import org.yandong.service.CourseCommentService;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseCommentController {

    @Reference
    private CourseCommentService courseCommentService;

    @GetMapping("comment/saveCourseComment")
    public Object testSaveComment() {
        CourseComment comment = new CourseComment();
        comment.setCourseId(7); // 课程编号
        comment.setSectionId(8); // 章节编号
        comment.setLessonId(10); // 小节编号
        comment.setUserId(100030011); // 用户编号
        comment.setUserName("1"); // 用户昵称
        comment.setParentId(0); // 没有父ID
        comment.setComment("good, you is very good"); // 留言内容
        comment.setType(0); // 0：表示用户留言
        comment.setLastOperator(100030011); // 最后操作的用户编号
        Integer integer = courseCommentService.saveComment(comment);
        System.out.println(integer);
        return null;
    }
    @GetMapping("comment/getCourseCommentList/{courseid}/{pageIndex}/{pageSize}")
    public List<CourseComment> getCommentsByCourseId(@PathVariable("courseid") Integer courseid, @PathVariable("pageIndex") Integer pageIndex, @PathVariable("pageSize") Integer pageSize) {
        int offset = (pageIndex-1)*pageSize;
        List<CourseComment> list = courseCommentService.getCommentsByCourseId(courseid, offset, pageSize);
        return list;
    }
}
