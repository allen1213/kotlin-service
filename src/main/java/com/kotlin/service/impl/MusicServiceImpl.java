package com.kotlin.service.impl;

import com.kotlin.bean.Music;
import com.kotlin.bean.example.MusicExample;
import com.kotlin.dao.MusicMapper;
import com.kotlin.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Override
    public int insertSelective(Music record) {
        return musicMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long musicId) {
        return musicMapper.deleteByPrimaryKey(musicId);
    }

    @Override
    public int updateByPrimaryKeySelective(Music record) {
        return musicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Music> selectByExample(MusicExample example) {
        return musicMapper.selectByExample(example);
    }

    @Override
    public List<Music> selectMusicByName(String musicName) {
        return musicMapper.selectMusicByName(musicName);
    }
}
