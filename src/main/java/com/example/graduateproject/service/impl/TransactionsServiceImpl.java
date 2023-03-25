package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.Transactions;
import com.example.graduateproject.mapper.TransactionsMapper;
import com.example.graduateproject.service.TransactionsService;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【transactions(交易记录表)】的数据库操作Service实现
* @createDate 2023-03-25 17:12:46
*/
@Service
public class TransactionsServiceImpl extends ServiceImpl<TransactionsMapper, Transactions>
implements TransactionsService{

}
