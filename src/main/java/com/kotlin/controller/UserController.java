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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;
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
    public Msg update(HttpServletRequest request, User user) {

        try {
            String path = "";
            CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                    request.getSession().getServletContext());

            if(multipartResolver.isMultipart(request)) {

                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
                Iterator iter = multiRequest.getFileNames();

                while (iter.hasNext()) {
                    MultipartFile file = multiRequest.getFile(iter.next().toString());

                    File userFile = new File("D:\\Code\\IDE\\kotlinMvp\\src\\main\\webapp\\user\\" + user.getUserId() + "\\");
                    if (!userFile.exists()) {
                        userFile.mkdirs();
                    }

                    if (file != null) {
                        path = "D:\\Code\\IDE\\kotlinMvp\\src\\main\\webapp\\user\\" + user.getUserId() + "\\" + file.getOriginalFilename();
                        //上传
                        file.transferTo(new File(path));
                    }
                    System.out.println(path);

                }
            }

            int count = userService.updateByPrimaryKeySelective(user);
            if (count != 0) {
                return Msg.success();
            }


        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }

        /*int count = userService.updateByPrimaryKeySelective(user);
        if (count != 0) {
            return Msg.success();
        }*/
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

    @ResponseBody
    @RequestMapping(value = "/user/selectAllVideos")
    public Msg selectAllVideos(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {

        PageHelper.startPage(pn,10);

        List<User> list = userService.selectAllVideos(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/user/fans")
    public Msg selectFans(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {

        PageHelper.startPage(pn,10);

        List<User> list = userService.selectFans(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/user/followers")
    public Msg selectFollowers(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn,String userId) {

        PageHelper.startPage(pn,10);

        List<User> list = userService.selectFollowers(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,10);

        return Msg.success().add("pageInfo",page);
    }

}
