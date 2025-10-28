package com.group2.whos_that_monster.service.impl;

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
public class ValidationServiceImpl implements IvalidationService {

    private final TriviaRepository triviaRepository;
    private final OptionRepository optionRepository;

    @Transactional(readOnly = true)
    @Override
    public ValidationResponse validateAnswer(Long triviaId, Long optionId) {
        // 1. Buscar trivia
        Trivia trivia = triviaRepository.findById(triviaId)
                .orElseThrow(() -> new IllegalArgumentException("Trivia not found"));

        // 2. Buscar opción
        Option option = optionRepository.findById(optionId)
                .orElseThrow(() -> new IllegalArgumentException("Option not found"));

        // 3. Verificar que pertenezca a la trivia
        if (!option.getTrivia().getId().equals(trivia.getId())) {
            throw new IllegalArgumentException("Option does not belong to the given trivia");
        }

        // 4. Validar si es correcta
        boolean isCorrect = Boolean.TRUE.equals(option.getIsCorrect());

        // 5. Obtener monstruo asociado (imagen completa)
        String monsterName = trivia.getMonster().getName();
        String monsterImageURL = trivia.getMonster().getImageURL();

        return new ValidationResponse(isCorrect, monsterName, monsterImageURL);
    }
}
