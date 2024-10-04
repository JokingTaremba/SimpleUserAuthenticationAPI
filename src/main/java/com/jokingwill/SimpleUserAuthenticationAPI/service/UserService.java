package com.jokingwill.SimpleUserAuthenticationAPI.service;

import com.jokingwill.SimpleUserAuthenticationAPI.model.User;

import java.util.List;

public interface UserService {

    String createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
}
