package com.diversity.Exception;

public class DiversityException extends RuntimeException{

    private String message;

    public DiversityException(String message)
    {
        super();
        this.message = message;
    }

}
