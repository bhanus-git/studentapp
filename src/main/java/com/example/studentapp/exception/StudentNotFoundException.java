package com.example.studentapp.exception;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
