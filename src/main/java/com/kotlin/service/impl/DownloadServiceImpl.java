package com.kotlin.service.impl;

import com.kotlin.bean.DownloadVideo;
import com.kotlin.dao.DownloadVideoMapper;
import com.kotlin.service.IDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownloadServiceImpl implements IDownloadService {

    @Autowired
    private DownloadVideoMapper downloadVideoMapper;

    @Override
    public int insertSelective(DownloadVideo record) {
        return downloadVideoMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long downloadId) {
        return downloadVideoMapper.deleteByPrimaryKey(downloadId);
    }
}
