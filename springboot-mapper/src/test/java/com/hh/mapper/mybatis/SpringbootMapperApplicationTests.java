package com.hh.mapper.mybatis;

import com.hh.mapper.mybatis.domain.User;
import com.hh.mapper.mybatis.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMapperApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    public void userTest(){
        User user = new User();
        user.setUsername("张三");
        user.setSex("男");
        //保存
        userService.saveOrUpdate(user);
        //保存后自增ID不为空(从1开始)
        Assertions.assertNotNull(user.getId());

        //查询
        user = userService.findById(user.getId());

        //删除
        Assertions.assertEquals(1,userService.deleteById(user.getId()));

    }


}
