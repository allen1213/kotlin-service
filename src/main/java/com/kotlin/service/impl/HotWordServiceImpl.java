package com.kotlin.service.impl;

import com.kotlin.bean.HotWord;
import com.kotlin.bean.example.HotWordExample;
import com.kotlin.dao.HotWordMapper;
import com.kotlin.service.IHotWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotWordServiceImpl implements IHotWordService {

    @Autowired
    private HotWordMapper hotWordMapper;

    @Override
    public int insertSelective(HotWord record) {
        return hotWordMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long hotId) {
        return hotWordMapper.deleteByPrimaryKey(hotId);
    }

    @Override
    public int updateByPrimaryKeySelective(HotWord record) {
        return hotWordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<HotWord> selectByExample(HotWordExample example) {
        return hotWordMapper.selectByExample(example);
    }
}
