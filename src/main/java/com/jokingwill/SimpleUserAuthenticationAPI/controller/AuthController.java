package com.jokingwill.SimpleUserAuthenticationAPI.controller;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.AuthRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.AuthResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login (@RequestBody AuthRequestDto authRequestDto){
        return ResponseEntity.ok(authService.login(authRequestDto));
    }


}
