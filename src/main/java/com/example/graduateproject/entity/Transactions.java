package com.example.graduateproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 交易记录表
 * @TableName transactions
 */
@TableName(value ="transactions")
@Data
public class Transactions implements Serializable {
    /**
     * 交易ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 交易类型
     */
    private Object type;

    /**
     * 交易更详细分类
     */
    private String category;

    /**
     * 交易账户
     */
    private String account;

    /**
     * 交易时间
     */
    private Date time;

    /**
     * 经办人
     */
    private String operator;

    /**
     * 所属项目
     */
    private String project;

    /**
     * 商家名称
     */
    private String merchant;

    /**
     * 交易备注
     */
    private String notes;

    /**
     * 转账账户
     */
    private String transferAccount;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 账本ID
     */
    private Integer bookId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}