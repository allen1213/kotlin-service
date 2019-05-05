package com.kotlin.service;

import com.kotlin.bean.Music;
import com.kotlin.bean.example.MusicExample;

import java.util.List;

public interface IMusicService {

    int insertSelective(Music record);

    int deleteByPrimaryKey(Long musicId);

    int updateByPrimaryKeySelective(Music record);

    List<Music> selectByExample(MusicExample example);

    List<Music> selectMusicByName(String musicName);
}
