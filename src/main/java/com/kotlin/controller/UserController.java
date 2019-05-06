package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.User;
import com.kotlin.result.Msg;
import com.kotlin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/user/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<User> list = userService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/user/selectUserById")
    public Msg selectUserById(String id) {

        if (userService.selectByPrimaryKey(Long.parseLong(id)) != null) {
            return Msg.success();
        }
        
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/user/insert")
    public Msg insert(User user) {

        int count = userService.insertSelective(user);
        System.out.println(count);
        if (count != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/user/update")
    public Msg update(User user) {

        int count = userService.updateByPrimaryKeySelective(user);
        if (count != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/user/delete")
    public Msg delete(String id) {
        Long userId = Long.parseLong(id.trim());
        int count = userService.deleteByPrimaryKey(userId);
        if (count != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/user/checkUserLogin")
    public Msg checkUserLogin(User user) {

        if (userService.checkUserLogin(user) != null) {
            return Msg.success().add("user",userService.checkUserLogin(user));
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/user/selectVideoWithUser")
    public Msg selectVideoWithUser(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {
        PageHelper.startPage(pn,10);

        List<User> list = userService.selectVideoWithUser(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

}
