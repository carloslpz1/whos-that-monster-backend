package com.group2.whos_that_monster.controller;

import org.springframework.http.ResponseEntity;
import com.group2.whos_that_monster.dto.ApiResponse;
import com.group2.whos_that_monster.dto.validation.ValidationRequest;
import com.group2.whos_that_monster.dto.validation.ValidationResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group2.whos_that_monster.service.IvalidationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/validation")
public class ValidationController {

    private final IvalidationService validationService;

    @PostMapping
    public ResponseEntity<ApiResponse<ValidationResponse>> validateAnswer(@RequestBody ValidationRequest request) {
        try {
            ValidationResponse response = validationService.validateAnswer(request.triviaId(), request.optionId());
            return ResponseEntity.ok(ApiResponse.success("Validation complete", response));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(ApiResponse.error(e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(ApiResponse.error("Unexpected error occurred"));
        }
    }
}