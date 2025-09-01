package com.personal.mongoTest.graphql.resolver;

import com.personal.mongoTest.graphql.dto.UserDTO;
import com.personal.mongoTest.graphql.dto.UserMapper;
import com.personal.mongoTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MutationResolver {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @MutationMapping
    public UserDTO createUser(@Argument String firstName, @Argument String lastName) {
        return userMapper.toDto(userService.createUser(firstName,lastName));
    }
}
