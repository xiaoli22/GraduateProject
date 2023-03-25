package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.BookMembers;
import com.example.graduateproject.mapper.BookMembersMapper;
import com.example.graduateproject.service.BookMembersService;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【book_members(账本成员表)】的数据库操作Service实现
* @createDate 2023-03-25 17:11:19
*/
@Service
public class BookMembersServiceImpl extends ServiceImpl<BookMembersMapper, BookMembers>
implements BookMembersService{

}
