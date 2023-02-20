package com.hh.plus.mybatis;

import com.hh.plus.mybatis.domain.User;
import com.hh.plus.mybatis.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {


	@Autowired
	private UserService userService;

	@Test
	public void userTest(){
		User user = new User();
		user.setUsername("张三");
		user.setSex("男");
		//保存
		userService.saveOrUpdate(user);
		//保存后自增ID不为空
		Assertions.assertNotNull(user.getId());

		//查询
		user = userService.getById(user.getId());

		//删除
		Assertions.assertTrue(userService.removeById(user.getId()));

	}

}
