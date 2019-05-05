package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.kotlin.bean.DownloadVideo;
import com.kotlin.result.Msg;
import com.kotlin.service.IDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadVideoController {

    @Autowired
    private IDownloadService downloadService;

    @ResponseBody
    @RequestMapping(value = "/download/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/download/delete")
    public Msg delete(String id) {
        if (downloadService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/download/insert")
    public Msg insert(DownloadVideo downloadVideo) {
        if (downloadService.insertSelective(downloadVideo) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
