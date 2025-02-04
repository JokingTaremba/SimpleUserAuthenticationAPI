package com.jokingwill.SimpleUserAuthenticationAPI.service.impl;
import com.jokingwill.SimpleUserAuthenticationAPI.exception.handlers.BadRequestException;
import com.jokingwill.SimpleUserAuthenticationAPI.exception.handlers.EntityNotFoundException;
import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import com.jokingwill.SimpleUserAuthenticationAPI.model.enums.UserRole;
import com.jokingwill.SimpleUserAuthenticationAPI.repository.UserRepository;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public String createUser(User user) {
        if(userRepository.existsByEmail(user.getEmail())){
            throw new BadRequestException("Já existe um usáurio com esse email!");
        }
        user.setRole(UserRole.ROLE_ADMIN);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "Usuário criado com sucesso!";
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
            return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Usuário não encontrado!"));
    }

}
