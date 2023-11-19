package com.xipengyuan.demo.persistence.repository;

import com.xipengyuan.demo.persistence.document.UserDoc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void testSave() {
        UserDoc userDoc = UserDoc.builder()
                .name("Jim")
                .age(18)
                .build();
        UserDoc saved = userRepository.save(userDoc);
        assertNotNull(saved);
        System.out.println("New user doc saved. _id: " + saved.getId());
        assertNotNull(saved.getId());
        assertEquals(userDoc.getName(), saved.getName());
        assertEquals(userDoc.getAge(), saved.getAge());
        assertNull(saved.getAddress());
    }
}
