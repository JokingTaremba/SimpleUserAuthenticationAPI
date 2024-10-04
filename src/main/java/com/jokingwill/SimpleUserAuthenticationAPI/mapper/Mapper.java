package com.jokingwill.SimpleUserAuthenticationAPI.mapper;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.UserRequestDto;
import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Mapper {

    private final ModelMapper modelMapper;

    public User mapUserRequestToModel(UserRequestDto userRequestDto){
        return modelMapper.map(userRequestDto, User.class);
    }
}
