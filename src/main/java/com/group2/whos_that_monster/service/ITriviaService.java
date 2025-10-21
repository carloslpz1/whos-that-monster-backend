package com.group2.whos_that_monster.service;

import com.group2.whos_that_monster.dto.trivia.TriviaResponse;

public interface ITriviaService {
    TriviaResponse getRandomTrivia();
}
