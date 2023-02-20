//package com.hh.fluent.mybatis;
//
//import cn.org.atool.fluent.mybatis.model.StdPagedList;
//import com.hh.fluent.mybatis.dao.intf.UserDao;
//import com.hh.fluent.mybatis.entity.UserEntity;
//import com.hh.fluent.mybatis.helper.UserSegment;
//import com.hh.fluent.mybatis.mapper.UserMapper;
//import com.hh.fluent.mybatis.wrapper.UserQuery;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//@SpringBootTest
//class SpringbootFlutetMybatisApplicationTests {
//
//	@Autowired
//	private UserDao userDao;
//
//	@Autowired
//	private UserMapper userMapper;
//
//	/***
//	 *
//	 *  UserDao使用，基本方法封装好，都是自动生成的
//	 *
//	 */
//	@Test
//	public void userDaoTest() {
//		UserEntity userEntity = new UserEntity().setName("张三").setSex("男");
//		//保存
//		Long id = userDao.save(userEntity);
//
//		Assertions.assertNotNull(id);
//
//		//查询
//		userEntity = userDao.selectById(id);
//
//		//删除
//		Assertions.assertTrue(userDao.deleteById(userEntity.getId()));
//
//	}
//
//	/***
//	 *
//	 *  测试fluent mybatis的CRUD特性
//	 *
//	 */
//	@Test
//	public void userMapperTest() {
//		UserEntity userEntity = new UserEntity().setName("张三").setSex("男");
//		//保存
//		userMapper.insert(userEntity);
//
//		Assertions.assertNotNull(userEntity.getId());
//
//		//组装SQL
//		UserQuery userQuery = new UserQuery()
//				//select 字段1，字段2...
//				.select.id().name().sex().end()
//				//where 条件
//				.where.and.id().eq(userEntity.getId()).end();
//		//查询
//		Optional<UserEntity> optionalUser = userMapper.findOne(UserEntity.class, userQuery);
//		if (optionalUser.isPresent()) {
//			userEntity = optionalUser.get();
//		}
//
//
//		//删除
//		Assertions.assertEquals(1,userMapper.deleteById(userEntity.getId()));
//
//	}
//
//}
