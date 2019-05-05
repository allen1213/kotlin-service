package com.kotlin.dao;

import com.kotlin.bean.WatchHistory;
import com.kotlin.bean.example.WatchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatchHistoryMapper {
    long countByExample(WatchHistoryExample example);

    int deleteByExample(WatchHistoryExample example);

    int deleteByPrimaryKey(Long watchId);

    int insert(WatchHistory record);

    int insertSelective(WatchHistory record);

    List<WatchHistory> selectByExample(WatchHistoryExample example);

    WatchHistory selectByPrimaryKey(Long watchId);

    int updateByExampleSelective(@Param("record") WatchHistory record, @Param("example") WatchHistoryExample example);

    int updateByExample(@Param("record") WatchHistory record, @Param("example") WatchHistoryExample example);

    int updateByPrimaryKeySelective(WatchHistory record);

    int updateByPrimaryKey(WatchHistory record);
}