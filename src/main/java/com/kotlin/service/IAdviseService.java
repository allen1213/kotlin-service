package com.kotlin.service;

import com.kotlin.bean.Advise;
import com.kotlin.bean.example.AdviseExample;

import java.util.List;

public interface IAdviseService {

    int insertSelective(Advise record);

    int deleteByPrimaryKey(Long adviseId);

    int updateByPrimaryKeySelective(Advise record);

    List<Advise> selectByExample(AdviseExample example);

    List<Advise> selectAdviseByUserId (Long userId);
}
