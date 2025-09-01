package com.personal.mongoTest.repository;

import com.personal.mongoTest.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User,String> {
}
