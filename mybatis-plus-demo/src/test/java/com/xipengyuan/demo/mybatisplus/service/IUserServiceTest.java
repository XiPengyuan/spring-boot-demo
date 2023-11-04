package com.xipengyuan.demo.mybatisplus.service;

import com.xipengyuan.demo.mybatisplus.dal.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class IUserServiceTest {

    @Autowired
    IUserService userService;

    @Test
    void testList() {
        List<UserEntity> list = userService.list();
        assertNotNull(list);
        list.forEach(System.out::println);
    }
}
