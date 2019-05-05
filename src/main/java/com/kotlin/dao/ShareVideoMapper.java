package com.kotlin.dao;

import com.kotlin.bean.ShareVideo;
import com.kotlin.bean.example.ShareVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareVideoMapper {
    long countByExample(ShareVideoExample example);

    int deleteByExample(ShareVideoExample example);

    int deleteByPrimaryKey(Long shareId);

    int insert(ShareVideo record);

    int insertSelective(ShareVideo record);

    List<ShareVideo> selectByExample(ShareVideoExample example);

    ShareVideo selectByPrimaryKey(Long shareId);

    int updateByExampleSelective(@Param("record") ShareVideo record, @Param("example") ShareVideoExample example);

    int updateByExample(@Param("record") ShareVideo record, @Param("example") ShareVideoExample example);

    int updateByPrimaryKeySelective(ShareVideo record);

    int updateByPrimaryKey(ShareVideo record);
}