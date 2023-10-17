package com.xipengyuan.demo.persistence.repository;

import com.xipengyuan.demo.persistence.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void testFindAll() {
        List<UserEntity> list = userRepository.findAll();
        assertNotNull(list);
    }
}
