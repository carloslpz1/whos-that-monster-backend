package com.group2.whos_that_monster.dto.validation;

public record ValidationResponse(
    Boolean isCorretBoolean,
    String nameMonster,
    String monsterImageURL
) {}
