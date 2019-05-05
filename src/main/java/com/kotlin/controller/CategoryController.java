package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Category;
import com.kotlin.result.Msg;
import com.kotlin.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "/category/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        List<Category> list = categoryService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/category/delete")
    public Msg delete(String id) {
        if (categoryService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/category/update")
    public Msg update(Category category) {
        if (categoryService.updateByPrimaryKeySelective(category) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/category/insert")
    public Msg insert(Category category) {
        if (categoryService.insertSelective(category) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

}
