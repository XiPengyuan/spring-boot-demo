package com.xipengyuan.demo.mongo.persistence.repository;

import com.xipengyuan.demo.mongo.persistence.document.RecipeDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<RecipeDoc, String> {
}
