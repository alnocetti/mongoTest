package com.personal.mongoTest.graphql.resolver;

import com.personal.mongoTest.entity.User;
import com.personal.mongoTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QueryResolver {

    @Autowired
    private UserService userService;

    @QueryMapping
    public String hello() {
        return "Hello, world!";
    }

    @QueryMapping
    public User getUser(@Argument String id) {
        return userService.getUserById(id);
    }
}
