package com.gwj.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.gwj.gmall.user.mapper")
public class GmallUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
	}

}
