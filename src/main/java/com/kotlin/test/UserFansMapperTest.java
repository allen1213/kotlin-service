package com.kotlin.test;

import com.kotlin.dao.UserFansMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserFansMapperTest {

    @Autowired
    private UserFansMapper userFansMapper;

    @Test
    public void testSelectFansCount() {
        Integer count = userFansMapper.selectFansCount(Long.parseLong("1"));
        System.out.println(count);
    }

    @Test
    public void testSelectFollowerCount() {
        Integer count = userFansMapper.selectFollowerCount(Long.parseLong("1"));
        System.out.println(count);
    }

}
