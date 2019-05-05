package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Music;
import com.kotlin.result.Msg;
import com.kotlin.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private IMusicService musicService;

    @ResponseBody
    @RequestMapping(value = "/music/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<Music> list = musicService.selectByExample(null);

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/music/selectMusicByName")
    public Msg selectMusicByName(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String musicName) {

        PageHelper.startPage(pn,10);

        List<Music> list = musicService.selectMusicByName(musicName);

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/music/delete")
    public Msg delete(String id) {
        if (musicService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/music/update")
    public Msg update(Music music) {
        if (musicService.updateByPrimaryKeySelective(music) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/music/insert")
    public Msg insert(Music music) {
        if (musicService.insertSelective(music) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
