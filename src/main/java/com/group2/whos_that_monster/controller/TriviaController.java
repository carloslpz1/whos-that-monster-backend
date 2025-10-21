package com.group2.whos_that_monster.controller;

import com.group2.whos_that_monster.dto.ApiResponse;
import com.group2.whos_that_monster.dto.trivia.TriviaResponse;
import com.group2.whos_that_monster.service.ITriviaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/trivia")
public class TriviaController {
    private final ITriviaService triviaService;

    @GetMapping
    public ResponseEntity<ApiResponse<TriviaResponse>> getRandomTrivia() {
        TriviaResponse randomTrivia = triviaService.getRandomTrivia();
        return ResponseEntity.ok(ApiResponse.success("Successful request", randomTrivia));
    }
}
