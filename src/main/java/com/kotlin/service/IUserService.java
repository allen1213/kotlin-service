package com.kotlin.service;

import com.kotlin.bean.User;
import com.kotlin.bean.example.UserExample;

import java.util.List;

public interface IUserService {

    User checkUserLogin(User user) ;

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int deleteByPrimaryKey(Long userId);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long userId);

}
