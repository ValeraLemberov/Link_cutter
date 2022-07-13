package com.anctest.link.cutter.controller;

import com.anctest.link.cutter.dao.UserRequestDto;
import com.anctest.link.cutter.dao.UserResponseDto;
import com.anctest.link.cutter.dao.mapper.UserMapper;
import com.anctest.link.cutter.service.AuthService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegisterController {
    private final AuthService authService;
    private final UserMapper userMapper;

    public RegisterController(AuthService authService,
                              UserMapper userMapper) {
        this.authService = authService;
        this.userMapper = userMapper;
    }

    @PostMapping
    @ApiOperation(value = "Register new user")
    public UserResponseDto registration(@RequestBody UserRequestDto userDto) {
        return userMapper
                .toDto(authService
                .registration(userMapper
                .toModel(userDto)));
    }
}
