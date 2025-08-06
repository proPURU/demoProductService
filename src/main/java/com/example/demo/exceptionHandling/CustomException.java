package com.example.demo.exceptionHandling;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {


    HttpStatus status;
    String message;

    public CustomException(HttpStatus status, String message) {
        super(message);
        this.status = status;
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}

