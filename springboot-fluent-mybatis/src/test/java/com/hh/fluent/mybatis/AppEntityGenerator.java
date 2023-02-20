package com.hh.fluent.mybatis;

import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Column;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;
import org.junit.jupiter.api.Test;

/**
  * fluent mybatis 生成类
  *
  * @author hang.yuan
  * @date 2023/2/20 19:28
  */

public class AppEntityGenerator {
    private static final String url = "jdbc:mysql://localhost:13306/demo?useSSL=false&useUnicode=true&characterEncoding=utf-8";

    @Test
    public void generate() {
        FileGenerator.build(Abc.class);
    }

    @Tables(
            /* 数据库连接信息 **/
            url = url, username = "root", password = "root123abc",
            /* Entity类parent package路径 **/
            basePack = "com.hh.fluent.mybatis",
            /* Entity代码源目录 **/
            srcDir = "src/main/java",
            /* Dao代码源目录 **/
            daoDir = "src/main/java",
            /* 需要生成文件的表 ( 表名称:对应的Entity名称 ) **/
            tables = @Table(
                    value = {
                            "user",
                    },
                    seqName = "auto",
                    columns = @Column(value = "id", javaType = Long.class)
            )
    )
    static class Abc {
    }
}