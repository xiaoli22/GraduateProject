package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.Users;
import com.example.graduateproject.mapper.UsersMapper;
import com.example.graduateproject.service.UsersService;
import org.springframework.stereotype.Service;

/**
* @author HP
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2023-03-25 17:12:52
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
implements UsersService{

}
