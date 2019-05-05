package com.kotlin.service.impl;

import com.kotlin.bean.Advise;
import com.kotlin.bean.example.AdviseExample;
import com.kotlin.dao.AdviseMapper;
import com.kotlin.service.IAdviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviseServiceImpl implements IAdviseService {

    @Autowired
    private AdviseMapper adviseMapper;

    @Override
    public int insertSelective(Advise record) {
        return adviseMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long adviseId) {
        return adviseMapper.deleteByPrimaryKey(adviseId);
    }

    @Override
    public int updateByPrimaryKeySelective(Advise record) {
        return adviseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Advise> selectByExample(AdviseExample example) {
        return adviseMapper.selectByExample(example);
    }

    @Override
    public List<Advise> selectAdviseByUserId(Long userId) {
        return adviseMapper.selectAdviseByUserId(userId);
    }
}
