package com.kotlin.dao;

import com.kotlin.bean.LikeVideo;
import com.kotlin.bean.example.LikeVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LikeVideoMapper {
    long countByExample(LikeVideoExample example);

    int deleteByExample(LikeVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LikeVideo record);

    int insertSelective(LikeVideo record);

    List<LikeVideo> selectByExample(LikeVideoExample example);

    LikeVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LikeVideo record, @Param("example") LikeVideoExample example);

    int updateByExample(@Param("record") LikeVideo record, @Param("example") LikeVideoExample example);

    int updateByPrimaryKeySelective(LikeVideo record);

    int updateByPrimaryKey(LikeVideo record);
}