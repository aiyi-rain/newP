package com.example.demomysql.mapper;

import com.example.demomysql.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author aiyi
* @description 针对表【test(测试数据库)】的数据库操作Mapper
* @createDate 2023-08-27 18:45:09
* @Entity com.example.demomysql.domain.Account
*/
@Mapper
public interface AccountMapper {
    void add(@Param("account") Account account);
    List<Account> query();

}




