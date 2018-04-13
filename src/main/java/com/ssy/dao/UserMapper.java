package com.ssy.dao;

import com.ssy.entity.User;

public interface UserMapper {
    //访问读数据库
    User selectUserById(int id);

    //访问写数据库
    int addUser(User user);
}
