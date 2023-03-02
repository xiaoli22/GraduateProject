package com.example.graduateproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 登录表
 * @TableName login
 */
@TableName(value ="login")
@Data
public class Login implements Serializable {
    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户名
     */
    private String password;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}