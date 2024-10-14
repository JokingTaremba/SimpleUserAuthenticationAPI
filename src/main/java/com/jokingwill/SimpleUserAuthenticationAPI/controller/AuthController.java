package com.jokingwill.SimpleUserAuthenticationAPI.controller;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.AuthRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.AuthResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "1. Authentication Controller")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    @Operation(summary = "Clique aqui para realizar o login/autenticação",
            description = "Para realizar a autenticação, é necessário ter uma conta criada. " +
                    "Preencha os campos com seu email e senha válidos para efetuar o login. Após o login, um token de acesso será retornado. " +
                    "Copie o token e, em seguida, clique no botão Authorize no canto superior direito e insira seu token lá!")
    public ResponseEntity<AuthResponseDto> login (@Valid @RequestBody AuthRequestDto authRequestDto){
        return ResponseEntity.ok(authService.login(authRequestDto));
    }


}
