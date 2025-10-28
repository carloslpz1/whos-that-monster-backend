package com.group2.whos_that_monster.service.impl;

import com.group2.whos_that_monster.dto.trivia.TriviaResponse;
import com.group2.whos_that_monster.entity.Option;
import com.group2.whos_that_monster.mapper.TriviaMapper;
import com.group2.whos_that_monster.entity.Trivia;
import com.group2.whos_that_monster.repository.TriviaRepository;
import com.group2.whos_that_monster.service.ITriviaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class TriviaServiceImpl implements ITriviaService {

    private final TriviaRepository triviaRepository;
    private final TriviaMapper mapper;

    @Override
    public TriviaResponse getRandomTrivia() {
        // Log fetching a random trivia
        log.info("Fetching a random trivia from the repository");

        Trivia randomTrivia = triviaRepository.findRandom();

        // Check if trivia exists
        if (randomTrivia == null) {
            log.warn("No trivia found in the repository");
            return null; // or throw an exception if appropriate
        }

        // Get the options of the trivia
        List<Option> options = randomTrivia.getOptions();
        log.debug("Original options order: {}", options);

        // Shuffle the options to randomize order
        Collections.shuffle(options);
        log.debug("Shuffled options order: {}", options);

        // Set the shuffled options back to the trivia entity
        randomTrivia.setOptions(options);

        // Map entity to response DTO
        TriviaResponse response = mapper.toResponse(randomTrivia);

        // Log completion
        log.info("Returning TriviaResponse for triviaId={}", randomTrivia.getId());
        return response;
    }
}