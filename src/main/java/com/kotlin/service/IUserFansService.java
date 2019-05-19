package com.kotlin.service;

import com.kotlin.bean.UserFans;

public interface IUserFansService {

    Integer selectFansCount(Long userId);

    Integer selectFollowerCount(Long userId);

    int deleteByPrimaryKey(Long id);

    int insertSelective(UserFans record);

    Integer deleteData(Long userId,Long fanId);

}
