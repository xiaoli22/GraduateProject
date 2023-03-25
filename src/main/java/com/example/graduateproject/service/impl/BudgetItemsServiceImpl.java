package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.BudgetItems;
import com.example.graduateproject.mapper.BudgetItemsMapper;
import com.example.graduateproject.service.BudgetItemsService;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【budget_items(预算小类表)】的数据库操作Service实现
* @createDate 2023-03-25 17:12:42
*/
@Service
public class BudgetItemsServiceImpl extends ServiceImpl<BudgetItemsMapper, BudgetItems>
implements BudgetItemsService{

}
