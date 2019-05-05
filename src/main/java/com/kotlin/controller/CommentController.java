package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Comment;
import com.kotlin.result.Msg;
import com.kotlin.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn) {

        PageHelper.startPage(pn,10);

        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/comment/selectCommentByVideoId")
    public Msg selectCommentByVideoId(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String videoId) {

        PageHelper.startPage(pn,10);

        List<Comment> list = commentService.selectCommentByVideoId(Long.parseLong(videoId));

        PageInfo page = new PageInfo(list,5);


        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/comment/delete")
    public Msg delete(String id) {
        if (commentService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/comment/update")
    public Msg update(Comment comment) {
        if (commentService.updateByPrimaryKeySelective(comment) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/comment/insert")
    public Msg insert(Comment comment) {
        if (commentService.insertSelective(comment) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }
}
