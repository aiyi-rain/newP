package com.example.demomysql;

import com.example.demomysql.domain.Account;
import com.example.demomysql.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoMysqlApplicationTests {
    @Autowired
private AccountMapper mapper;
    @Test
    void contextLoads() {
        mapper.query().stream().forEach(System.out::println);
    }
    @Test
    void test(){
        Account account = Account.builder().name("里斯").password("123456").age(18).build();
        mapper.add(account);
    }

}
