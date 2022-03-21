package org.yandong.service;

public interface CourseCommentFavoriteRecordService {

    Integer saveFavorite(Integer comment_id, Integer userid);

    Integer cancelFavorite(Integer comment_id, Integer userid);
}
