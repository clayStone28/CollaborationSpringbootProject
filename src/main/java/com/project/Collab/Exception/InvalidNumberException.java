package com.project.Collab.Exception;

public class InvalidNumberException extends RuntimeException {

    int statusCode;
    String status;
    double sum;
    String message;

    public InvalidNumberException(int statusCode, String status, double sum, String message) {
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message;
    }

    public InvalidNumberException(String message, int statusCode, String status, double sum, String message1) {
        super(message);
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message1;
    }

    public InvalidNumberException(String message, Throwable cause, int statusCode, String status, double sum, String message1) {
        super(message, cause);
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message1;
    }

    public InvalidNumberException(Throwable cause, int statusCode, String status, double sum, String message) {
        super(cause);
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message;
    }

    public InvalidNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int statusCode, String status, double sum, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message1;
    }
}
