package org.yandong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 课程留言表(CourseComment)实体类
 *
 * @author yandong
 * @since 2022-03-18 14:14:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseComment implements Serializable {
    private static final long serialVersionUID = -40534578692313679L;
    /**
     * 主键
     */
    private Object id;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 章节id
     */
    private Integer sectionId;
    /**
     * 课时id
     */
    private Integer lessonId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 运营设置用户昵称
     */
    private String userName;
    /**
     * 父级评论id
     */
    private Integer parentId;
    /**
     * 是否置顶：0不置顶，1置顶
     */
    private Integer isTop;
    /**
     * 评论
     */
    private String comment;
    /**
     * 点赞数
     */
    private Integer likeCount;
    /**
     * 是否回复留言：0普通留言，1回复留言
     */
    private Integer isReply;
    /**
     * 留言类型：0用户留言，1讲师留言，2运营马甲 3讲师回复 4小编回复 5官方客服回复
     */
    private Integer type;
    /**
     * 留言状态：0待审核，1审核通过，2审核不通过，3已删除
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除
     */
    private Integer isDel;
    /**
     * 最后操作者id
     */
    private Integer lastOperator;
    /**
     * 是否发送了通知,1表示未发出，0表示已发出
     */
    private Integer isNotify;
    /**
     * 标记归属
     */
    private Integer markBelong;
    /**
     * 回复状态 0 未回复 1 已回复
     */
    private Integer replied;


}

