package com.group2.whos_that_monster.dto.monster;

public record MonsterDTOResponse(
        Long id,
        String name,
        String imageSilhouette,
        String imageReal
) {}