package com.jokingwill.SimpleUserAuthenticationAPI.controller;


import com.jokingwill.SimpleUserAuthenticationAPI.dto.UserRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.mapper.Mapper;
import com.jokingwill.SimpleUserAuthenticationAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final Mapper mapper;
    private final UserService userService;

    @PostMapping("/")
    public ResponseEntity<String> createUser(@RequestBody UserRequestDto userRequestDto){
        return new ResponseEntity<>(userService.createUser(mapper.mapUserRequestToModel(userRequestDto)),
                HttpStatus.CREATED);
    }


}
