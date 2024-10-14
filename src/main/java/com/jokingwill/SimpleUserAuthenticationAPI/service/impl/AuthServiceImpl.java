package com.jokingwill.SimpleUserAuthenticationAPI.service.impl;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.AuthRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.AuthResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.exception.EntityNotFoundException;
import com.jokingwill.SimpleUserAuthenticationAPI.security.JwtService;
import com.jokingwill.SimpleUserAuthenticationAPI.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
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
        var auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.email(), authRequestDto.password()));
        if (!auth.isAuthenticated()) throw new EntityNotFoundException("Email ou Senha invalida!");
        return new AuthResponseDto(jwtService.generateToken(authRequestDto.email(), new HashMap<>()));
    }

}
