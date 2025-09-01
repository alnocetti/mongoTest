package com.personal.mongoTest.service;

import com.personal.mongoTest.entity.User;
import com.personal.mongoTest.repository.UserMongoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserMongoRepository userMongoRepository;

    @Cacheable(value = "users", key = "#id")
    public User getUserById(String id) {
        return userMongoRepository.findById(id).orElse(null);
    }

    @Cacheable("users")
    public List<User> getUsers() {
        return userMongoRepository.findAll();
    }

    public User createUser(String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return userMongoRepository.save(user);
    }
}
