package com.zfkr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zfkr.**.dao")
public class Test14Application {

    public static void main(String[] args) {
        SpringApplication.run(Test14Application.class, args);
    }

}
