package com.codebloggingapplication.blog.services;

import com.codebloggingapplication.blog.entities.User;
import com.codebloggingapplication.blog.payloads.UserDto;

import java.util.*;

public interface UserService {

    UserDto registerNewUser(UserDto user);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);

    //UserDto createUser(UserDto user);
}
