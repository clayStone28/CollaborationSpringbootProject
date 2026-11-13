package com.project.Collab.DTO;


public class AddResponse{

    public int statusCode;
    public int status;
    public double sum;
    public String message;

    public AddResponse(int statusCode, int status, double sum, String message) {
        this.statusCode = statusCode;
        this.status = status;
        this.sum = sum;
        this.message = message;
    }

    public AddResponse() {

    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public int getStatus() {
        return status;
    }

    public double getSum() {
        return sum;
    }

    public String getMessage() {
        return message;
    }
}
