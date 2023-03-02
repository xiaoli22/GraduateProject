package com.example.graduateproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.graduateproject.entity.Login;
import com.example.graduateproject.util.Result;

/**
* @author HP
* @description 针对表【login_table(testdb.`login_table`)】的数据库操作Service
* @createDate 2023-02-25 17:18:10
*/
public interface LoginService extends IService<Login> {

     Result<Login> login(String email, String password);

     void findAll();
}
