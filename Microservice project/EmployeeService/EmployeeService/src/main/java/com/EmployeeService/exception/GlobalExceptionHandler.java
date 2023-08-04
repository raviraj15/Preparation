package com.EmployeeService.exception;


import com.EmployeeService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiResponse> handelResourceNotFoundException(ResourceNotFound e)
    {
        String message = e.getMessage();

        ApiResponse build = ApiResponse.builder().message(message).success(true).
                status(HttpStatus.NOT_FOUND).build();
    return new ResponseEntity<>(build,HttpStatus.NOT_FOUND);
    }
}
