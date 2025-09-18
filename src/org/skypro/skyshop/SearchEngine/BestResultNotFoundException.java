package org.skypro.skyshop.SearchEngine;

public class BestResultNotFoundException extends RuntimeException{

    public BestResultNotFoundException() {
    }

    public BestResultNotFoundException(String message) {
        super(message);
    }

    public BestResultNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BestResultNotFoundException(Throwable cause) {
        super(cause);
    }

    public BestResultNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
