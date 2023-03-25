package com.example.graduateproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 账本表
 * @TableName books
 */
@TableName(value ="books")
@Data
public class Books implements Serializable {
    /**
     * 账本ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 账本名称
     */
    private String name;

    /**
     * 创建者ID
     */
    private Integer creatorId;

    /**
     * 分享码
     */
    private String shareCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}