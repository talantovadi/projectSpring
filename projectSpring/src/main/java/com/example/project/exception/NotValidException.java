package com.example.project.exception;

public class NotValidException extends RuntimeException{
    public NotValidException(String msg) {
        super(msg);
    }
}
