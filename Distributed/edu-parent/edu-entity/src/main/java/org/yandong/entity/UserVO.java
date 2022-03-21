package org.yandong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO {

    private int state; // 操作状态
    private String message; // 状态描述
    private User content; // 响应内容
}
