package org.yandong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 讲师表(Teacher)实体类
 *
 * @author yandong
 * @since 2022-03-15 17:52:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher implements Serializable {
    private static final long serialVersionUID = -99999618339521330L;
    /**
     * id
     */
    private Object id;
    /**
     * 课程ID
     */
    private Integer courseId;
    /**
     * 讲师姓名
     */
    private String teacherName;
    /**
     * 职务
     */
    private String position;
    /**
     * 讲师介绍
     */
    private String description;
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


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

}

