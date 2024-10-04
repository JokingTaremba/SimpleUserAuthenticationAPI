package com.jokingwill.SimpleUserAuthenticationAPI.service.impl;

import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public String createUser(User user) {
        return "";
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
