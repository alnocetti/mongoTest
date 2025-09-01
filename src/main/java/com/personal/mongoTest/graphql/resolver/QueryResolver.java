package com.personal.mongoTest.graphql.resolver;

import com.personal.mongoTest.graphql.dto.UserDTO;
import com.personal.mongoTest.graphql.dto.UserMapper;
import com.personal.mongoTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class QueryResolver {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @QueryMapping
    public String hello() {
        return "Hello, world!";
    }

    @QueryMapping
    public UserDTO getUser(@Argument String id) {
        return userMapper.toDto(userService.getUserById(id));
    }

    @QueryMapping
    public List<UserDTO> getUsers() {
        return userService.getUsers().stream().map(userMapper::toDto).toList();
    }
}
