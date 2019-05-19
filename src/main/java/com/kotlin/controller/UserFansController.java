package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.UserFans;
import com.kotlin.result.Msg;
import com.kotlin.service.IUserFansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserFansController {

    @Autowired
    private IUserFansService userFansService;

    @ResponseBody
    @RequestMapping(value = "/fans/fansCount")
    public Msg selectFansCount(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {

        //PageHelper.startPage(pn,10);

        Integer count = userFansService.selectFansCount(Long.parseLong(userId));


        return Msg.success().add("count",count);
    }

    @ResponseBody
    @RequestMapping(value = "/fans/followersCount")
    public Msg selectFollowerCount(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {

       // PageHelper.startPage(pn,10);

        Integer count = userFansService.selectFollowerCount(Long.parseLong(userId));

        return Msg.success().add("count",count);
    }

    @ResponseBody
    @RequestMapping(value = "/fans/delete")
    public Msg delete(String userId,String fanId) {

        if(userFansService.deleteData(Long.parseLong(userId),Long.parseLong(fanId)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/fans/insert")
    public Msg insert(UserFans userFans) {

        if(userFansService.insertSelective(userFans) != 0) {
            return Msg.success();
        }

        return Msg.fail();
    }

}
