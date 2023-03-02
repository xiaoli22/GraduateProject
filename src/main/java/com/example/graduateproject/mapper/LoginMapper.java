package com.example.graduateproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.graduateproject.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author HP
 * @description 针对表【login(登录表)】的数据库操作Mapper
 * @createDate 2023-02-27 16:52:44
 * @Entity com.example.graduateproject.entity.Login
 */
@Mapper
@Component
public interface LoginMapper extends BaseMapper<Login> {
    void insertUser();
}
