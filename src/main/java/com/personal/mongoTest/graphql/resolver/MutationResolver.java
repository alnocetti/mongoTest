package com.personal.mongoTest.graphql.resolver;

import com.personal.mongoTest.entity.User;
import com.personal.mongoTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MutationResolver {

    @Autowired
    private UserService userService;

    @MutationMapping
    public User createUser(@Argument String firstName, @Argument String lastName) {
        return userService.createUser(firstName,lastName);
    }
}
