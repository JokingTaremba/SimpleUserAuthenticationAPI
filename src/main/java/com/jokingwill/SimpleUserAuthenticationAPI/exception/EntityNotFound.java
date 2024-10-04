package com.jokingwill.SimpleUserAuthenticationAPI.exception;

public class EntityNotFound extends BadRequestException{

    public EntityNotFound(String message){
        super(message);
    }
}
