package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Collect;
import com.kotlin.result.Msg;
import com.kotlin.service.ICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CollectController {

    @Autowired
    private ICollectService collectService;

    @ResponseBody
    @RequestMapping(value = "/collect/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<Collect> list = collectService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/collect/delete")
    public Msg delete(String id) {

        if (collectService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }

        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/collect/update")
    public Msg update(Collect collect) {

        if (collectService.updateByPrimaryKeySelective(collect) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/collect/insert")
    public Msg insert(Collect collect) {
        if (collectService.insertSelective(collect) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
