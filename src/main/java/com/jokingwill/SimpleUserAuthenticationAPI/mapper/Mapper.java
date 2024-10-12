package com.jokingwill.SimpleUserAuthenticationAPI.mapper;

import com.jokingwill.SimpleUserAuthenticationAPI.dto.requestDto.CreateUserDto;
import com.jokingwill.SimpleUserAuthenticationAPI.dto.responseDto.UserResponseDto;
import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapper {

    private final ModelMapper modelMapper;

    public User mapUserRequestToModel(CreateUserDto userRequestDto){
        return modelMapper.map(userRequestDto, User.class);
    }

    public UserResponseDto mapUserToResponseDto(User user){
        return modelMapper.map(user, UserResponseDto.class);
    }

    public List<UserResponseDto> mapUserToResponseDtoList(List<User> users){
        return users.stream().map(this::mapUserToResponseDto).collect(Collectors.toList());
    }

}
