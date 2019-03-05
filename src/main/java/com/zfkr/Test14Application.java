package com.zfkr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zfkr.**.dao")
public class Test14Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Test14Application.class, args);
    }

}
