package com.xipengyuan.demo.mybatisplus.dal.entity;

import com.xipengyuan.demo.mybatisplus.dal.enumeration.Grade;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserEntityTest {

    @Test
    void testInsert() {
        UserEntity user = new UserEntity();
        user.setNumber("010007");
        user.setName("Jim");
        user.setAge(8);
        user.setGrade(Grade.PRIMARY);
        user.setEmail("test7@baomido.com");
        boolean inserted = user.insert();
        assertTrue(inserted);
        assertThat(user.getId()).isNotNull();
        System.out.println("The UserEntity saved. ID=" + user.getId());
    }
}
