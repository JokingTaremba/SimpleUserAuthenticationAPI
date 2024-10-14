package com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto;

import com.jokingwill.SimpleUserAuthenticationAPI.model.enums.UserRole;
import lombok.Data;

@Data
public class UserResponseDto {

    private String id;
    private String username;
    private String email;
    private UserRole role;
}
