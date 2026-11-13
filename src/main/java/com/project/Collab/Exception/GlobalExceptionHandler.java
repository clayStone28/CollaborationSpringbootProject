package com.project.Collab.Exception;

import com.project.Collab.DTO.AddResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
//    public GlobalExceptionHandler(String message) {
//        super(message);
//    }

    @ExceptionHandler(InvalidNumberException.class)
    public ResponseEntity<AddResponse> handleInvalidNumber(InvalidNumberException e)
    {
        AddResponse response = new AddResponse(400,-1,0, e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }


}
