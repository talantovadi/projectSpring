package com.example.project.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String msg) {
        super(msg);
    }

}
