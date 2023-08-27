package com.example.demomysql;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.demomysql.mapper")
public class DemoMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMysqlApplication.class, args);
    }

}
