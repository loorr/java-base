package org.example.day6.atm.exception;

public class NoAccountException extends RuntimeException{
    private String message;
    public NoAccountException(String message) {
        super(message);
        this.message = message;
    }
}
