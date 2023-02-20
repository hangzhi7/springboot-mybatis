package com.hh.mapper.mybatis.service.impl;

import com.hh.mapper.mybatis.domain.User;
import com.hh.mapper.mybatis.mapper.UserMapper;
import com.hh.mapper.mybatis.service.UserService;
import io.mybatis.service.AbstractService;
import org.springframework.stereotype.Service;

/**
  * 业务处理层
  *
  * @author hang.yuan
  * @date 2023/2/20 17:37
  */
@Service
public class UserServiceImpl extends AbstractService<User,Long, UserMapper> implements UserService {
}
