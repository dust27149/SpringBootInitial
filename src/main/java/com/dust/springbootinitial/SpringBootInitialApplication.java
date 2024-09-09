package com.dust.springbootinitial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dust.springbootinitial.mapper")
public class SpringBootInitialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInitialApplication.class, args);
    }

}
