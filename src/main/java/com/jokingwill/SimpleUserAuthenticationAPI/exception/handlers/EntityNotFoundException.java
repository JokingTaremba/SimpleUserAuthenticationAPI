package com.jokingwill.SimpleUserAuthenticationAPI.exception.handlers;

public class EntityNotFoundException extends BadRequestException {

    public EntityNotFoundException(String message){
        super(message);
    }
}
