package com.xipengyuan.demo.mongo.persistence.repository;

import com.xipengyuan.demo.mongo.persistence.document.RecipeDoc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository recipeRepository;

    @Test
    void test() {
        RecipeDoc recipe = RecipeDoc.builder()
                .portionYield(new BigDecimal("2.12"))
                .createdTime(LocalDateTime.now())
                .build();
        RecipeDoc entity = recipeRepository.save(recipe);
        assertNotNull(entity);
        assertNotNull(entity.getId());

        Optional<RecipeDoc> optional = recipeRepository.findById(entity.getId());
        assertTrue(optional.isPresent());

        recipe = optional.get();
        assertEquals(entity.getId(), recipe.getId());
        assertEquals(entity.getPortionYield(), recipe.getPortionYield());

        recipeRepository.delete(entity);
    }
}
