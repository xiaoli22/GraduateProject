package com.example.graduateproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 预算小类表
 * @TableName budget_items
 */
@TableName(value ="budget_items")
@Data
public class BudgetItems implements Serializable {
    /**
     * 预算小类ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 预算小类类型
     */
    private Object type;

    /**
     * 支出预算
     */
    private BigDecimal budget;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 预算大类ID
     */
    private Integer categoryId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}