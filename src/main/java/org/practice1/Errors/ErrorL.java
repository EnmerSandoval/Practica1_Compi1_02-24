package org.practice1.Errors;

public class ErrorL extends Exception {

    public ErrorL(String message) {
        super(message);
    }

    public ErrorL(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorL(Throwable cause){
        super(cause);
    }

    public ErrorL(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
