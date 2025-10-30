package com.group2.whos_that_monster.service;

import com.group2.whos_that_monster.dto.validation.ValidationResponse;

public interface IvalidationService {
ValidationResponse validateAnswer(Long triviaId, Long optionId);
}
