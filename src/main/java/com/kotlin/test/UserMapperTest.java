package com.kotlin.test;

import com.kotlin.bean.User;
import com.kotlin.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectVideoWithUser() {

        List<User> userList = userMapper.selectVideoWithUser((long) 1);

        System.out.println(userList.get(0).getVideoList().get(0).getVideoDescription());

    }

    @Test
    public void testSelectAllVideos() {
        List<User> list = userMapper.selectAllVideos(Long.parseLong("0"));

        System.out.println("the total size : "+list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the user is "+list.get(i).getUserName()+" video list's size : "+list.get(i).getVideoList().size());

            for (int j = 0; j < list.get(i).getVideoList().size(); j++) {
                System.out.println(list.get(i).getVideoList().get(j).getVideoPlayurl());
            }

        }

    }

    @Test
    public void testSelectFans() {
        List<User> list = userMapper.selectFans(Long.parseLong("1"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUserName());
        }
    }

    @Test
    public void testSelectFollowers() {
        List<User> list = userMapper.selectFollowers(Long.parseLong("1"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUserName());
        }
    }

}
