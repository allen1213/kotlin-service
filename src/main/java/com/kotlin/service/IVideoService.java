package com.kotlin.service;

import com.kotlin.bean.Video;
import com.kotlin.bean.example.VideoExample;

import java.util.List;

public interface IVideoService {

    List<Video> selectVideoByUserId(Long userId);

    int insert(Video video);

    int deleteByPrimaryKey(Long videoId);

    List<Video> selectByExample(VideoExample example);

    int updateByPrimaryKeySelective(Video record);

}
