package com.kotlin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kotlin.bean.Video;
import com.kotlin.result.Msg;
import com.kotlin.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@Controller
public class VideoController {

    @Autowired
    IVideoService videoService;

    private static final String VIDEO_BASE_PATH = "";

    /**
     * 用户主要查询方法
     * @param pn
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/video/selectVideoByUserId")
    public Msg selectVideoByUserId(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn, String userId) {

        PageHelper.startPage(pn,10);

        List<Video> list = videoService.selectVideoByUserId(Long.parseLong(userId));

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    /**
     * 管理员查询方法
     * @param pn
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/video/query")
    public Msg query(@RequestParam(value = "pn" ,defaultValue = "1") Integer pn){

        PageHelper.startPage(pn,10);

        List<Video> list = videoService.selectByExample(null);

        PageInfo page = new PageInfo(list,5);

        return Msg.success().add("pageInfo",page);
    }

    @ResponseBody
    @RequestMapping(value = "/video/insert")
    public Msg insert(Video video) {
        if(videoService.insert(video) != 0 ) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/video/delete")
    public Msg deleteByPrimaryKey(String id) {

        if (videoService.deleteByPrimaryKey(Long.parseLong(id)) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "/video/update")
    public Msg updateByPrimaryKeySelective(Video video) {

        if (videoService.updateByPrimaryKeySelective(video) != 0) {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "video/upload")
    public Msg uploadFile(HttpServletRequest request, HttpServletResponse response, Video video) {

        try {

            String path = "";
            boolean isSuccess = false;
            //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
            CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                    request.getSession().getServletContext());

            //检查form中是否有enctype="multipart/form-data"
            if(multipartResolver.isMultipart(request)) {
                //将request变成多部分request
                MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
                //获取multiRequest 中所有的文件名
                Iterator iter=multiRequest.getFileNames();

                while(iter.hasNext()) {
                    //一次遍历所有文件
                    MultipartFile file=multiRequest.getFile(iter.next().toString());

                    File userFile = new File("D:\\Code\\IDE\\kotlinMvp\\src\\main\\webapp\\user\\" + video.getUserId() + "\\video\\");
                    if (!userFile.exists()){
                        userFile.mkdirs();
                    }

                    if(file!=null) {
                        path ="D:\\Code\\IDE\\kotlinMvp\\src\\main\\webapp\\user\\" + video.getUserId() + "\\video\\" + file.getOriginalFilename();
                        //上传
                        file.transferTo(new File(path));
                    }
                    System.out.println(path);

                }

                if (videoService.insert(video) != 0 ){
                    isSuccess = true;
                    System.out.println("插入成功~~~~~~~~~~~~~~~~~~~~~~~");
                } else {
                    isSuccess = false;
                    return Msg.fail();
                }

                if (isSuccess)
                    return Msg.success();
                else
                    return Msg.fail();

            } else {
                System.out.println("[--------------------------------]没有enctype=multipart/form-data");
                return Msg.fail();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Msg.fail();
    }


}
