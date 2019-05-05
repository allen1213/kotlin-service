package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.kotlin.result.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WatchHistoryController {

    @ResponseBody
    @RequestMapping(value = "/history/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/history/delete")
    public Msg delete(String id) {
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/history/update")
    public Msg update() {
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/history/insert")
    public Msg insert() {
        return Msg.fail();
    }
}
