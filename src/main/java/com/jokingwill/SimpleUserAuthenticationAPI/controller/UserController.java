package com.jokingwill.SimpleUserAuthenticationAPI.controller;


import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.CreateUserDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.UserResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.mapper.Mapper;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
@Tag(name = "2. User Controller")
public class UserController {


    private final Mapper mapper;
    private final UserService userService;

    @PostMapping("/create")
    @Operation(summary = "Clique aqui para criar um novo usuário",
            description = "Para criar um novo usuário, preencha corretamente os campos de nome, email e senha. Após o cadastro, acesse o endpoint de autenticação para realizar o login!")
    public ResponseEntity<String> createUser(@Valid @RequestBody CreateUserDto userRequestDto){
        return new ResponseEntity<>(userService.createUser(mapper.mapUserRequestToModel(userRequestDto)),
                HttpStatus.CREATED);
    }

    @GetMapping("/")
    @Operation(summary = "Para se certificar de que você está logado ou autenticado, clique aqui para ver a lista de todos os usuários",
            description = "Para visualizar todos os usuários, é necessário estar autenticado e já ter fornecido um token de acesso válido!")
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(mapper.mapUserToResponseDtoList(userService.getAllUsers()));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Para se certificar de que você está logado ou autenticado, clique aqui para ver os usuários pelo ID",
            description = "Para visualizar os usuários pelo ID, é necessário estar autenticado e já ter fornecido um token de acesso válido. Em seguida, insira o número de ID que deseja buscar!")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(mapper.mapUserToResponseDto(
                userService.getUserById(id)
        ));
    }
}


