package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Admin;
import com.kotlin.result.Msg;
import com.kotlin.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @ResponseBody
    @RequestMapping(value = "/admin/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn){

        PageHelper.startPage(pn,10);
        List<Admin> list = adminService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);

    }

    @ResponseBody
    @RequestMapping(value = "/admin/insert")
    public Msg insert(Admin admin){
        if(adminService.insertSelective(admin) != 0 ) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/admin/update")
    public Msg update(Admin admin){
        if(adminService.updateByPrimaryKeySelective(admin) != 0 ) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/admin/delete")
    public Msg delete(String id){
        if(adminService.deleteByPrimaryKey(Long.parseLong(id)) != 0 ) {
            return Msg.success();
        }
        return Msg.fail();
    }

}
