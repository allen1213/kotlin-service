package com.kotlin.service.impl;

import com.kotlin.bean.Collect;
import com.kotlin.bean.example.CollectExample;
import com.kotlin.dao.CollectMapper;
import com.kotlin.service.ICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements ICollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Override
    public int insertSelective(Collect record) {
        return collectMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long collectId) {
        return collectMapper.deleteByPrimaryKey(collectId);
    }

    @Override
    public int updateByPrimaryKeySelective(Collect record) {
        return collectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Collect> selectByExample(CollectExample example) {
        return collectMapper.selectByExample(example);
    }

    @Override
    public List<Collect> selectCollectByVideoId(Long videoId) {
        return collectMapper.selectCollectByVideoId(videoId);
    }
}
