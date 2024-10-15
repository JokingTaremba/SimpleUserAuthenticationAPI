package com.jokingwill.SimpleUserAuthenticationAPI.service.impl;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.AuthRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.AuthResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.exception.handlers.EntityNotFoundException;
import com.jokingwill.SimpleUserAuthenticationAPI.security.JwtService;
import com.jokingwill.SimpleUserAuthenticationAPI.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @Override
    @Transactional
    public AuthResponseDto login(AuthRequestDto authRequestDto) {
        try {
            var auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequestDto.email(), authRequestDto.password())
            );
            return new AuthResponseDto(jwtService.generateToken(authRequestDto.email(), new HashMap<>()));
        } catch (AuthenticationException e) {
            throw new EntityNotFoundException("Nenhum usuário encontrado com essas credenciais. Email ou Senha inválidos!");
        }
    }

}
