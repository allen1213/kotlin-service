package com.kotlin.service.impl;

import com.kotlin.bean.User;
import com.kotlin.bean.example.UserExample;
import com.kotlin.dao.UserMapper;
import com.kotlin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> selectVideoWithUser(Long userId) {
        return userMapper.selectVideoWithUser(userId);
    }

    @Override
    public User checkUserLogin(User user) {
        return userMapper.checkUserLogin(user);
    }

    @Override
    public List<User> selectAllVideos(Long userId) {
        return userMapper.selectAllVideos(userId);
    }

    @Override
    public List<User> selectFans(Long userId) {
        return userMapper.selectFans(userId);
    }

    @Override
    public List<User> selectFollowers(Long userId) {
        return userMapper.selectFollowers(userId);
    }

    @Override
    public List<User> selectRecommendUser(Long userId) {
        return userMapper.selectRecommendUser(userId);
    }
}
