package com.hh.mapper.mybatis.domain;

import io.mybatis.provider.Entity;
import lombok.Data;

/**
  *  用户实体
  *
  * @author hang.yuan
  * @date 2023/2/20 16:59
  */
@Data
@Entity.Table("user")
public class User {
  @Entity.Column(id = true)
  private Long id;
  @Entity.Column("name")
  private String username;
  @Entity.Column
  private String sex;

}
