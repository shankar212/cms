package com.cmsa.exception;

public class StaffExistsException extends RuntimeException {
    public StaffExistsException(String message) {
        super(message);
    }
}
