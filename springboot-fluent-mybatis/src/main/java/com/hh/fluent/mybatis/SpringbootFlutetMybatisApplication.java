package com.hh.fluent.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hh.fluent.mybatis.mapper")
@SpringBootApplication
public class SpringbootFlutetMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFlutetMybatisApplication.class, args);
	}

}
