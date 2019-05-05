package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Advise;
import com.kotlin.result.Msg;
import com.kotlin.service.IAdviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdviseController {

    @Autowired
    private IAdviseService adviseService;

    @ResponseBody
    @RequestMapping(value = "/advise/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<Advise> list = adviseService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/advise/selectAdviseByUserId")
    public Msg selectAdviseByUserId(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String id) {
        PageHelper.startPage(pn,10);

        List<Advise> list = adviseService.selectAdviseByUserId(Long.parseLong(id));

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/advise/delete")
    public Msg delete(String id) {
        if (adviseService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/advise/update")
    public Msg update(Advise advise) {
        if (adviseService.updateByPrimaryKeySelective(advise) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/advise/insert")
    public Msg insert(Advise advise) {
        if (adviseService.insertSelective(advise) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

}
