package com.hh.plus.mybatis.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
  *  用户实体
  *
  * @author hang.yuan
  * @date 2023/2/20 16:59
  */
@Data
@TableName("user")
public class User {
  private Long id;
  @TableField("name")
  private String username;
  private String sex;

}
