package com.group2.whos_that_monster.controller;

import com.group2.whos_that_monster.dto.ApiResponse;
import com.group2.whos_that_monster.dto.trivia.TriviaResponse;
import com.group2.whos_that_monster.service.ITriviaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Trivia", description = "Endpoints to manage and retrieve trivia questions")
@RequiredArgsConstructor
@RestController
@RequestMapping("/trivia")
public class TriviaController {

    private final ITriviaService triviaService;

    @Operation(summary = "Get a random trivia question", description = "Returns a random trivia question with all its options.")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Successfully retrieved trivia"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "Trivia not found"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping
    public ResponseEntity<ApiResponse<TriviaResponse>> getRandomTrivia() {
        TriviaResponse randomTrivia = triviaService.getRandomTrivia();
        return ResponseEntity.ok(ApiResponse.success("Successful request", randomTrivia));
    }
}
