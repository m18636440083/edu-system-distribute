package org.yandong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import mapper.CourseCommentFavoriteRecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.yandong.service.CourseCommentFavoriteRecordService;

@Service
public class CourseCommentFavoriteRecordServiceImpl implements CourseCommentFavoriteRecordService {

    @Autowired
    private CourseCommentFavoriteRecordDao courseCommentFavoriteRecordDao;
    @Override
    public Integer saveFavorite(Integer comment_id, Integer userid) {
        Integer i = courseCommentFavoriteRecordDao.existsFavorite(comment_id, userid);
        int i1 = 0;
        int i2 = 0;
        if (i == 0) { // 查询是否给某个用户的某条留言点过赞
            i1 = courseCommentFavoriteRecordDao.saveCommentFavorite(comment_id, userid);
        } else {
            i1 = courseCommentFavoriteRecordDao.updateFavoriteStatus(0, comment_id, userid);
        }
        i2 = courseCommentFavoriteRecordDao.updateLikeCount(1, comment_id);
        if (i1 == 0 || i2 == 0) {
            throw new RuntimeException("点赞失败");
        }
        return comment_id;
    }

    /**
     * 删除点赞的信息（is_del = 1）
     * 更新留言赞的数量-1
     * @param comment_id 留言编号
     * @param userid 用户编号
     * @return 0:失败，1：成功
     */
    public Integer cancelFavorite(Integer comment_id, Integer userid) {
        Integer i1 = courseCommentFavoriteRecordDao.updateFavoriteStatus(1, comment_id, userid);
        Integer i2 = courseCommentFavoriteRecordDao.updateLikeCount(-1, comment_id);
        if (i1 == 0 || i2 == 0) {
            throw new RuntimeException("取消赞失败！");
        }
        return i2;
    }
}
