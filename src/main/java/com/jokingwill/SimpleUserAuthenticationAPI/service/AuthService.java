package com.jokingwill.SimpleUserAuthenticationAPI.service;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.AuthRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.AuthResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.model.User;

public interface AuthService {

    AuthResponseDto login(AuthRequestDto authRequestDto);
}
