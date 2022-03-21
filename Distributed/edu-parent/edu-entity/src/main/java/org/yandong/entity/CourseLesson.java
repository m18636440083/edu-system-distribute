package org.yandong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 课程节内容(CourseLesson)实体类
 *
 * @author yandong
 * @since 2022-03-15 17:52:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseLesson implements Serializable {
    private static final long serialVersionUID = 430878427456800475L;

    private CourseMedia courseMedia; // 一个小节对应一个视频
    /**
     * id
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
     * 课时主题
     */
    private String theme;
    /**
     * 课时时长(分钟)
     */
    private Integer duration;
    /**
     * 是否免费
     */
    private Integer isFree;
    /**
     * 记录创建时间
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
     * 排序字段
     */
    private Integer orderNum;
    /**
     * 课时状态,0-隐藏，1-未发布，2-已发布
     */
    private Integer status;


}

