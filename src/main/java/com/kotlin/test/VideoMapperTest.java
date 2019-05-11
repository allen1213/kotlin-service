package com.kotlin.test;

import com.kotlin.bean.Video;
import com.kotlin.dao.VideoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class VideoMapperTest {

    @Autowired
    private VideoMapper videoMapper;

    @Test
    public void testSelectVideoByUserId() {
        List<Video> list = videoMapper.selectVideoByUserId(Long.parseLong("1"));
        for (Video video:
             list) {
            System.out.println(video.getUser().getRegistdate());
        }
    }

}
