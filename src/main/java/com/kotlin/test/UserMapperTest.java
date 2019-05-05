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

}
