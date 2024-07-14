package com.xipengyuan.demo.mongo.persistence.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document("recipes")
@TypeAlias("Recipe")
@AllArgsConstructor
@Getter
@Builder
public class RecipeDoc {

    @MongoId(FieldType.OBJECT_ID)
    private final String id;

    private final BigDecimal portionYield;

    private final LocalDateTime createdTime;

    private final LocalDateTime updatedTime;
}
