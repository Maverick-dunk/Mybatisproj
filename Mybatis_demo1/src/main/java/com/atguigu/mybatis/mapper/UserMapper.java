package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * Created by lgxxl on 2023/2/6.
 */
public interface UserMapper {



    int insertUser();

    void updateUser();

    void deleteUser();

    User getuserById();

    List<User> getAllUser();






}
