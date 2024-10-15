package com.jokingwill.SimpleUserAuthenticationAPI.exception.handlers;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        super(message);
    }
}
