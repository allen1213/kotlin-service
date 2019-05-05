package com.kotlin.dao;

import com.kotlin.bean.HotWord;
import com.kotlin.bean.example.HotWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWordMapper {
    long countByExample(HotWordExample example);

    int deleteByExample(HotWordExample example);

    int deleteByPrimaryKey(Long hotId);

    int insert(HotWord record);

    int insertSelective(HotWord record);

    List<HotWord> selectByExample(HotWordExample example);

    HotWord selectByPrimaryKey(Long hotId);

    int updateByExampleSelective(@Param("record") HotWord record, @Param("example") HotWordExample example);

    int updateByExample(@Param("record") HotWord record, @Param("example") HotWordExample example);

    int updateByPrimaryKeySelective(HotWord record);

    int updateByPrimaryKey(HotWord record);
}