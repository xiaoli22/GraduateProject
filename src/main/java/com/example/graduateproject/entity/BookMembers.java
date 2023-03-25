package com.example.graduateproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 账本成员表
 * @TableName book_members
 */
@TableName(value ="book_members")
@Data
public class BookMembers implements Serializable {
    /**
     * 账本ID
     */
    @TableId
    private Integer bookId;

    /**
     * 成员ID
     */
    @TableId
    private Integer memberId;

    /**
     * 成员角色
     */
    private Object role;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}