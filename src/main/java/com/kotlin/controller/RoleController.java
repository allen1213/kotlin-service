package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Role;
import com.kotlin.result.Msg;
import com.kotlin.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @ResponseBody
    @RequestMapping(value = "/role/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<Role> list = roleService.selectByExample(null);

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/role/delete")
    public Msg delete(String id) {
        if (roleService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/role/update")
    public Msg update(Role role) {
        if (roleService.updateByPrimaryKeySelective(role) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/role/insert")
    public Msg insert(Role role) {
        if (roleService.insertSelective(role) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
