package com.cmsa.exception;

public class StudentExistsException extends RuntimeException {
    public StudentExistsException(String message) {
        super(message);
    }
}
