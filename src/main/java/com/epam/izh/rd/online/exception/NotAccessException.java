package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {
    public NotAccessException(String errorMessage) {
        super(errorMessage);
    }

    public NotAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }

    public NotAccessException() {
    }
}
