package com.example.studentapp.exception;

import org.springframework.http.HttpStatus;

public class StudentException {

    private String message;
    private Throwable cause;
    private HttpStatus status;

    public StudentException(String message, Throwable cause, HttpStatus status) {
        this.message = message;
        this.cause = cause;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getCause() {
        return cause;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
