package com.xipengyuan.demo.mybatisplus.dal.mapper;

import com.xipengyuan.demo.mybatisplus.dal.entity.UserEntity;
import com.xipengyuan.demo.mybatisplus.dal.enumeration.Grade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserEntity> userList = userMapper.selectList(null);
        assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void testInsert() {
        UserEntity user = new UserEntity();
        user.setNumber("010006");
        user.setName("Tim");
        user.setAge(14);
        user.setGrade(Grade.SECONDARY);
        user.setEmail("test6@baomido.com");
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
        System.out.println("The User saved. ID=" + user.getId());
    }
}
