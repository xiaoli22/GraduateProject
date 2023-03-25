package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.Books;
import com.example.graduateproject.mapper.BooksMapper;
import com.example.graduateproject.service.BooksService;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【books(账本表)】的数据库操作Service实现
* @createDate 2023-03-25 17:12:39
*/
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
implements BooksService{

}
