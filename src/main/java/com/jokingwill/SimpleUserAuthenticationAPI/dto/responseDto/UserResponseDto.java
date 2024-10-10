package com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto;

import com.jokingwill.SimpleUserAuthenticationAPI.model.enums.UserRole;
import lombok.Data;

import java.util.List;
@Data
public class UserResponseDto {

    private String id;
    private String username;
    private String email;
    private UserRole role;
}
