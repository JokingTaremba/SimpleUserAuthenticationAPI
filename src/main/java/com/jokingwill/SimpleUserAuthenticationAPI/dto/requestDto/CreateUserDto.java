package com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserDto {

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;
    @Email
    private String email;
    @NotBlank
    @Size(min = 3, max = 20)
    private String password;
}
