package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Video;
import com.kotlin.result.Msg;
import com.kotlin.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VideoController {

    @Autowired
    IVideoService videoService;

    /**
     * 用户主要查询方法
     * @param pn
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/video/selectVideoByUserId")
    public Msg selectVideoByUserId(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn, String userId) {

        PageHelper.startPage(pn,10);

        List<Video> list = videoService.selectVideoByUserId(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    /**
     * 管理员查询方法
     * @param pn
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/video/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn){

        PageHelper.startPage(pn,10);

        List<Video> list = videoService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/video/insert")
    public Msg insert(Video video) {
        if(videoService.insert(video) != 0 ) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/video/delete")
    public Msg deleteByPrimaryKey(String id) {

        if (videoService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/video/update")
    public Msg updateByPrimaryKeySelective(Video video) {

        if (videoService.updateByPrimaryKeySelective(video) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }


}
