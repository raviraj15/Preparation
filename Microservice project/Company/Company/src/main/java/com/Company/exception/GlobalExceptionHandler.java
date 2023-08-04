package com.Company.exception;

import com.Company.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handelResourceNotFoundException(ResourceNotFoundException e)
    {
        String message = e.getMessage();

        ApiResponse build = ApiResponse.builder().message(message).success(true).
                status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(build,HttpStatus.NOT_FOUND);
    }
}
