package com.example.Algoritms.exceptions;

public class NullItemException extends RuntimeException {
    public NullItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NullItemException(Throwable cause) {
        super(cause);
    }

    public NullItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItemException(String message) {
        super(message);
    }

    public NullItemException() {
    }
}
