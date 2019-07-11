package com.baizhi;


import com.baizhi.common.ServerResponse;
import com.baizhi.dao.UserMapper;
import com.baizhi.pojo.User;
import com.baizhi.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/config/spring-mybatis.xml")
public class TestUser {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService iUserService;

    @Test
    public void test1(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
//        ServerResponse<User> user = iUserService.getInformation(1);
//        System.out.println(user);
    }
}
