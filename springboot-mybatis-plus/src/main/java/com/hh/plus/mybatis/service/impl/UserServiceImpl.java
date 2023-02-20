package com.hh.plus.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hh.plus.mybatis.domain.User;
import com.hh.plus.mybatis.mapper.UserMapper;
import com.hh.plus.mybatis.service.UserService;
import org.springframework.stereotype.Service;

/**
  * 业务处理层
  *
  * @author hang.yuan
  * @date 2023/2/20 18:32
  */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
