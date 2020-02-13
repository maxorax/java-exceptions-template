package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Exception{
    public UserAlreadyRegisteredException(String errorMessage) {
        super(errorMessage);
    }

    public UserAlreadyRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyRegisteredException(Throwable cause) {
        super(cause);
    }

    public UserAlreadyRegisteredException() {
    }
}
