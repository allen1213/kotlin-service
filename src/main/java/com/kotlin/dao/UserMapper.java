package com.kotlin.dao;

import com.kotlin.bean.User;
import com.kotlin.bean.example.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User checkUserLogin(User user);

    List<User> selectVideoWithUser(Long userId);

    List<User> selectAllVideos(Long userId);

    List<User> selectFans(Long userId);

    List<User> selectFollowers(Long userId);

    List<User> selectRecommendUser(Long userId);
}