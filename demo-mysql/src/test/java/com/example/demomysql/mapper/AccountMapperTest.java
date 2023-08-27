package com.example.demomysql.mapper;

import com.example.demomysql.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AccountMapperTest {
    @Autowired
    private AccountMapper mapper;

    @Test
    void add() {
        Account account = Account.builder().name("王艺").password("123456").age(18).build();
        mapper.add(account);
    }

    @Test
    void query() {
        mapper.query().stream().forEach(System.out::println);
    }
}