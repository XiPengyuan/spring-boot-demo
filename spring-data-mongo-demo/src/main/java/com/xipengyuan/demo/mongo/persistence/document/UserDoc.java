package com.xipengyuan.demo.mongo.persistence.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
@TypeAlias("User")
@AllArgsConstructor
@Getter
@Builder
public class UserDoc {

    @Id
    private final String id;

    private final String name;

    private final Integer age;

    @Field("address")
    private final String address;
}
