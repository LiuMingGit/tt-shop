package com.lm.ttshop.dao;

import com.lm.ttshop.pojo.po.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 刘铭 on 2017/8/31 0031.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao-test.xml")
public class TbUserMapperTest {

    @Autowired
    private TbUserMapper userMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        TbUser user = userMapper.selectByPrimaryKey(3L);
        System.out.println(user);
    }
}