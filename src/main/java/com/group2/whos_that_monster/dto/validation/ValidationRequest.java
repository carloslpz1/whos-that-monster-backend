package com.group2.whos_that_monster.dto.validation;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Request to validate the option selected in a trivia")
public record ValidationRequest(

        @Schema(description = "ID of the trivia being answered", example = "1", required = true)
        Long triviaId,

        @Schema(description = "ID of the option selected by the user", example = "3", required = true)
        Long optionId

) {}