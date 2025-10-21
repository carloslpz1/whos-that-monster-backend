package com.group2.whos_that_monster.service.impl;

import com.group2.whos_that_monster.dto.trivia.TriviaResponse;
import com.group2.whos_that_monster.mapper.TriviaMapper;
import com.group2.whos_that_monster.entity.Trivia;
import com.group2.whos_that_monster.repository.TriviaRepository;
import com.group2.whos_that_monster.service.ITriviaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TriviaServiceImpl implements ITriviaService {
    private final TriviaRepository triviaRepository;
    private final TriviaMapper mapper;

    @Override
    public TriviaResponse getRandomTrivia() {
        Trivia randomTrivia = triviaRepository.findRandom();
        return mapper.toResponse(randomTrivia);
    }
}
