package com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto;


import lombok.Data;

@Data
public class CreateUserDto {

    private String username;
    private String email;
    private String password;
}
