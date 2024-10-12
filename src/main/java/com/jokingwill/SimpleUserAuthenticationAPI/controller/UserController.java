package com.jokingwill.SimpleUserAuthenticationAPI.controller;


import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.CreateUserDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.UserResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.mapper.Mapper;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {


    private final Mapper mapper;
    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto userRequestDto){
        return new ResponseEntity<>(userService.createUser(mapper.mapUserRequestToModel(userRequestDto)),
                HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(mapper.mapUserToResponseDtoList(userService.getAllUsers()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(mapper.mapUserToResponseDto(
                userService.getUserById(id)
        ));
    }
}


