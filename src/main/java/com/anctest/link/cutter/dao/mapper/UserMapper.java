package com.anctest.link.cutter.dao.mapper;

import com.anctest.link.cutter.dao.UserRequestDto;
import com.anctest.link.cutter.dao.UserResponseDto;
import com.anctest.link.cutter.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toModel(UserRequestDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setUsername(userDto.getUsername());
        return user;
    }

    public UserResponseDto toDto(User user) {
        UserResponseDto userDto = new UserResponseDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
