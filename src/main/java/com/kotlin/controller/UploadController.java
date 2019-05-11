package com.kotlin.controller;

import com.kotlin.result.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Iterator;

@Controller
public class UploadController {

    @RequestMapping(value = "upload/uploadFile")
    public Msg uploadFile(HttpServletRequest request, HttpServletResponse response,String userId) {

        try {

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

                    if(file!=null) {
                        String path="user/" + userId + "/" + file.getOriginalFilename();
                        //上传
                        file.transferTo(new File(path));
                    }
                }

                return Msg.success();

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
