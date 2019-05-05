package com.kotlin.service;

import com.kotlin.bean.HotWord;
import com.kotlin.bean.example.HotWordExample;

import java.util.List;

public interface IHotWordService {

    int insertSelective(HotWord record);

    int deleteByPrimaryKey(Long hotId);

    int updateByPrimaryKeySelective(HotWord record);

    List<HotWord> selectByExample(HotWordExample example);

}
