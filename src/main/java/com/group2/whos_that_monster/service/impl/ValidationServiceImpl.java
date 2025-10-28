package com.group2.whos_that_monster.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.group2.whos_that_monster.dto.validation.ValidationResponse;
import com.group2.whos_that_monster.entity.Option;
import com.group2.whos_that_monster.entity.Trivia;
import com.group2.whos_that_monster.repository.OptionRepository;
import com.group2.whos_that_monster.repository.TriviaRepository;
import com.group2.whos_that_monster.service.IvalidationService;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Slf4j
public class ValidationServiceImpl implements IvalidationService {

    private final TriviaRepository triviaRepository;
    private final OptionRepository optionRepository;

    @Transactional(readOnly = true)
    @Override
    public ValidationResponse validateAnswer(Long triviaId, Long optionId) {
        log.info("Validating answer for triviaId={} and optionId={}", triviaId, optionId);

        // 1. Find the trivia by ID
        Trivia trivia = triviaRepository.findById(triviaId)
                .orElseThrow(() -> {
                    log.warn("Trivia not found for triviaId={}", triviaId);
                    return new IllegalArgumentException("Trivia not found");
                });

        // 2. Find the option by ID
        Option option = optionRepository.findById(optionId)
                .orElseThrow(() -> {
                    log.warn("Option not found for optionId={}", optionId);
                    return new IllegalArgumentException("Option not found");
                });

        // 3. Verify that the option belongs to the trivia
        if (!option.getTrivia().getId().equals(trivia.getId())) {
            log.warn("OptionId={} does not belong to triviaId={}", optionId, triviaId);
            throw new IllegalArgumentException("Option does not belong to the given trivia");
        }

        // 4. Check if the option is correct
        boolean isCorrect = Boolean.TRUE.equals(option.getIsCorrect());
        log.debug("Option correctness: {}", isCorrect);

        // 5. Retrieve associated monster details
        String monsterName = trivia.getMonster().getName();
        String monsterImageURL = trivia.getMonster().getImageURL();
        log.debug("Associated monster: {} ({})", monsterName, monsterImageURL);

        log.info("Validation completed for triviaId={} and optionId={}", triviaId, optionId);
        return new ValidationResponse(isCorrect, monsterName, monsterImageURL);
    }
}