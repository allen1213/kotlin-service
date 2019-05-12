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

    List<User> selectVideoWithUser(Long userId);

    List<User> selectAllVideos(Long userId);

    List<User> selectFans(Long userId);

    List<User> selectFollowers(Long userId);

}
