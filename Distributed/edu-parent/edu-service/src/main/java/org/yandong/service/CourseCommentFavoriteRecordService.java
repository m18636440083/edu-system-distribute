package org.yandong.service;

import org.apache.ibatis.annotations.Param;

public interface CourseCommentFavoriteRecordService {

    Integer saveFavorite(Integer comment_id, Integer userid);

    Integer cancelFavorite(Integer comment_id, Integer userid);
}
