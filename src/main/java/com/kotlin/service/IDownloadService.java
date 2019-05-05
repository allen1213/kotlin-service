package com.kotlin.service;

import com.kotlin.bean.DownloadVideo;

public interface IDownloadService {

    int insertSelective(DownloadVideo record);

    int deleteByPrimaryKey(Long downloadId);
}
