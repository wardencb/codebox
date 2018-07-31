package com.cky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cky.mapper")
public class SpringboottemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottemplateApplication.class, args);
	}
}
