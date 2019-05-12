package com.kotlin.service.impl;

import com.kotlin.bean.Video;
import com.kotlin.bean.example.VideoExample;
import com.kotlin.dao.VideoMapper;
import com.kotlin.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements IVideoService {

    @Autowired
    VideoMapper videoMapper;

    @Override
    public List<Video> selectVideoByUserId(Long userId) {
        return videoMapper.selectVideoByUserId(userId);
    }

    @Override
    public int insert(Video video) {
        return videoMapper.insertSelective(video);
    }

    @Override
    public int deleteByPrimaryKey(Long videoId) {
        return videoMapper.deleteByPrimaryKey(videoId);
    }

    @Override
    public List<Video> selectByExample(VideoExample example) {
        return videoMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Video record) {
        return videoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Integer selectVideoCountByUserId(Long userId) {
        return videoMapper.selectVideoCountByUserId(userId);
    }
}
