package com.kotlin.service;

import com.kotlin.bean.Collect;
import com.kotlin.bean.example.CollectExample;

import java.util.List;

public interface ICollectService {

    int insertSelective(Collect record);

    int deleteByPrimaryKey(Long collectId);

    int updateByPrimaryKeySelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    List<Collect> selectCollectByVideoId(Long videoId);

}
