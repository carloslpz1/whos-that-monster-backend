package com.group2.whos_that_monster.dto.trivia;

import com.group2.whos_that_monster.dto.option.OptionResponse;

import java.util.List;

public record TriviaResponse(
        Long id,
        String silhouetteURL,
        Long correctAnswer,
        List<OptionResponse> options
) {
}
