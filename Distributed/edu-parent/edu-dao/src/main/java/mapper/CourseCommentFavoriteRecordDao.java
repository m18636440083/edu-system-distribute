package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程留言点赞表(CourseCommentFavoriteRecord)表数据库访问层
 *
 * @author yandong
 * @since 2022-03-18 20:39:00
 */
@Repository
public interface CourseCommentFavoriteRecordDao {

    /**
     * 查询是否给某个用户的某条留言点过赞
     *
     * @param comment_id 留言id
     * @param userid     用户id
     * @return 没点过赞返回0，点过赞返回1
     */
    public Integer existsFavorite(@Param("cid") Integer comment_id, @Param("uid") Integer userid);

    /**
     * 没有点过赞，保存点赞信息
     *
     * @param comment_id 留言id
     * @param userid     用户id
     * @return 保存成功返回1，否则返回0
     */
    public Integer saveCommentFavorite(@Param("cid") Integer comment_id, @Param("uid") Integer userid);

    /**
     * 更改点赞状态
     *
     * @param status     点赞状态（0：已赞， 1：取消赞）
     * @param comment_id 留言id
     * @param userid     用户id
     * @return 更改成功返回1， 否则返回0
     */
    public Integer updateFavoriteStatus(@Param("status") Integer status, @Param("cid") Integer comment_id, @Param("uid") Integer userid);


    /**
     * 更新点赞的数量
     *
     * @param x          +1的话，赞的数量增加，-1的话，赞的数量减少
     * @param comment_id 留言id
     * @return 更新成功返回1， 失败返回0
     */
    public Integer updateLikeCount(@Param("x") Integer x, @Param("comment_id") Integer comment_id);
}

