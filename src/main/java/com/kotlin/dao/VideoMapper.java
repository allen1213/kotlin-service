package com.kotlin.dao;

import com.kotlin.bean.Video;
import com.kotlin.bean.example.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    long countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Long videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Long videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    List<Video> selectVideoByUserId(Long userId);

    Integer selectVideoCountByUserId(Long userId);

    List<Video> selectAllVideos(Long userId);

    List<Video> selectMyFollowerVideos(Long userId);

}