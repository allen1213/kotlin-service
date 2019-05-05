package com.kotlin.dao;

import com.kotlin.bean.Advise;
import com.kotlin.bean.example.AdviseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviseMapper {
    long countByExample(AdviseExample example);

    int deleteByExample(AdviseExample example);

    int deleteByPrimaryKey(Long adviseId);

    int insert(Advise record);

    int insertSelective(Advise record);

    List<Advise> selectByExample(AdviseExample example);

    Advise selectByPrimaryKey(Long adviseId);

    int updateByExampleSelective(@Param("record") Advise record, @Param("example") AdviseExample example);

    int updateByExample(@Param("record") Advise record, @Param("example") AdviseExample example);

    int updateByPrimaryKeySelective(Advise record);

    int updateByPrimaryKey(Advise record);

    List<Advise> selectAdviseByUserId (Long userId);
}