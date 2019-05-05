package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Message;
import com.kotlin.result.Msg;
import com.kotlin.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private IMessageService messageService;

    @ResponseBody
    @RequestMapping(value = "/message/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String fromUserId,String toUserId) {

        PageHelper.startPage(pn,10);

        List<Message> list = messageService.selectMessageByUserId(Long.parseLong(fromUserId), Long.parseLong(toUserId));

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/message/delete")
    public Msg delete(String id) {
        if (messageService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }


    @ResponseBody
    @RequestMapping(value = "/message/insert")
    public Msg insert(Message message) {
        if (messageService.insertSelective(message) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
