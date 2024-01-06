package com.xipengyuan.demo.mongo.persistence.repository;

import com.xipengyuan.demo.mongo.persistence.document.UserDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDoc, String> {
}
