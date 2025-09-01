package com.personal.mongoTest.graphql.dto;

import com.personal.mongoTest.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserDTO toDto(User user);
}
