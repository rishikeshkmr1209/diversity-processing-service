package com.diversity.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DiversityExceptionHandler {

    @ExceptionHandler(value = RecordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public DiversityErrorResponse handleRecordNotFoundException(RecordNotFoundException ex)
    {
        return new DiversityErrorResponse(HttpStatus.NOT_FOUND.value(),
                ex.getMessage());
    }
}
