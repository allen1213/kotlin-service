package com.kotlin.service.impl;

import com.kotlin.bean.UserFans;
import com.kotlin.dao.UserFansMapper;
import com.kotlin.service.IUserFansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFansServiceImpl implements IUserFansService {

    @Autowired
    private UserFansMapper userFansMapper;

    @Override
    public Integer selectFansCount(Long userId) {
        return userFansMapper.selectFansCount(userId);
    }

    @Override
    public Integer selectFollowerCount(Long userId) {
        return userFansMapper.selectFollowerCount(userId);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userFansMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(UserFans record) {
        return userFansMapper.insertSelective(record);
    }

    @Override
    public Integer deleteData(Long userId, Long fanId) {
        return userFansMapper.deleteData(userId,fanId);
    }
}
