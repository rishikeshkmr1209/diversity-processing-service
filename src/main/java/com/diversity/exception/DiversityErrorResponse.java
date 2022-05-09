package com.diversity.exception;

public class DiversityErrorResponse {

    private int statusCode;
    private String message;

    public DiversityErrorResponse()
    {

    }

    public DiversityErrorResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
