package com.group2.whos_that_monster.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.group2.whos_that_monster.dto.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Manejo de errores específicos de validación
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponse<?>> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.badRequest()
                .body(new ApiResponse<>("error", ex.getMessage(), null));
    }

    // Manejo de cualquier otro error inesperado
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleGeneral(Exception ex) {
        return ResponseEntity.internalServerError()
                .body(new ApiResponse<>("error", ex.getMessage(), null));
    }
}
