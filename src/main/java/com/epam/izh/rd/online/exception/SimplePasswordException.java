package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {
    public SimplePasswordException(String errorMessage) {
        super(errorMessage);
    }

    public SimplePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimplePasswordException(Throwable cause) {
        super(cause);
    }

    public SimplePasswordException() {
    }
}
