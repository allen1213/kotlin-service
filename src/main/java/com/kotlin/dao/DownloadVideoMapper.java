package com.kotlin.dao;

import com.kotlin.bean.DownloadVideo;
import com.kotlin.bean.example.DownloadVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadVideoMapper {
    long countByExample(DownloadVideoExample example);

    int deleteByExample(DownloadVideoExample example);

    int deleteByPrimaryKey(Long downloadId);

    int insert(DownloadVideo record);

    int insertSelective(DownloadVideo record);

    List<DownloadVideo> selectByExample(DownloadVideoExample example);

    DownloadVideo selectByPrimaryKey(Long downloadId);

    int updateByExampleSelective(@Param("record") DownloadVideo record, @Param("example") DownloadVideoExample example);

    int updateByExample(@Param("record") DownloadVideo record, @Param("example") DownloadVideoExample example);

    int updateByPrimaryKeySelective(DownloadVideo record);

    int updateByPrimaryKey(DownloadVideo record);
}