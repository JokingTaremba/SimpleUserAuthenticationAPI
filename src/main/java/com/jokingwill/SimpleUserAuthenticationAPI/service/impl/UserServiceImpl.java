package com.jokingwill.SimpleUserAuthenticationAPI.service.impl;

import com.jokingwill.SimpleUserAuthenticationAPI.exception.BadRequestException;
import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import com.jokingwill.SimpleUserAuthenticationAPI.repository.UserRepository;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String createUser(User user) {
        if(userRepository.existsByEmail(user.getEmail())){
            throw new BadRequestException("Já existe um usáurio com esse email!");
        }
        userRepository.save(user);
        return "Usuário criado com sucesso!";
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
