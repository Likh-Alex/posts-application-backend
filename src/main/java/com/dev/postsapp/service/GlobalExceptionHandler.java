package com.dev.postsapp.service;

import com.dev.postsapp.controller.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandler {
    public ResponseEntity<BaseResponse> handleRuntimeException(RuntimeException exception) {
        String error = exception.getMessage();
        BaseResponse response = new BaseResponse();
        response.setError(error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
