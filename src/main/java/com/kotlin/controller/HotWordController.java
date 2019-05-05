package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.HotWord;
import com.kotlin.result.Msg;
import com.kotlin.service.IHotWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HotWordController {

    @Autowired
    private IHotWordService hotWordService;

    @ResponseBody
    @RequestMapping(value = "/hotWord/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<HotWord> list = hotWordService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/hotWord/delete")
    public Msg delete(String id) {
        if (hotWordService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/hotWord/update")
    public Msg update(HotWord hotWord) {
        if (hotWordService.updateByPrimaryKeySelective(hotWord) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/hotWord/insert")
    public Msg insert(HotWord hotWord) {
        if (hotWordService.insertSelective(hotWord) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
