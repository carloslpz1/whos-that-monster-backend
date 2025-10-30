package com.group2.whos_that_monster.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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

@Tag(name = "Validation", description = "Endpoints to validate answers for trivia questions")
@RequiredArgsConstructor
@RestController
@RequestMapping("/validation")
public class ValidationController {

    private final IvalidationService validationService;


    @Operation(summary = "Validate a trivia answer", description = "Checks if the selected option is correct for the given trivia question.")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Validation completed successfully"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Invalid input or request parameters"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Unexpected internal server error")
    })
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