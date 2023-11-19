package com.xipengyuan.demo.persistence.repository;

import com.xipengyuan.demo.persistence.document.UserDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDoc, String> {
}
