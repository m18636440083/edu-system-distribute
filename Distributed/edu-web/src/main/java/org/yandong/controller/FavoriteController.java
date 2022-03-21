package org.yandong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yandong.service.CourseCommentFavoriteRecordService;

@RestController
@RequestMapping("/course")
public class FavoriteController {

    @Reference
    private CourseCommentFavoriteRecordService courseCommentFavoriteRecordService;

    @RequestMapping("/comment/saveFavorite/{commentid}/{userid}")
    public Integer saveFavorite(@PathVariable("commentid") Integer commentid, @PathVariable("userid") Integer userid) {
        Integer integer = courseCommentFavoriteRecordService.saveFavorite(commentid, userid);
        return  integer;
    }

    @RequestMapping("/comment/cancelFavorite/{commentid}/{userid}")
    public Integer cancelFavorite(@PathVariable("commentid") Integer commentid, @PathVariable("userid") Integer userid) {
        Integer integer = courseCommentFavoriteRecordService.cancelFavorite(commentid, userid);
        return integer;
    }
}
