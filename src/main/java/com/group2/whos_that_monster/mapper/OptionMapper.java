package com.group2.whos_that_monster.mapper;

import com.group2.whos_that_monster.dto.option.OptionResponse;
import com.group2.whos_that_monster.entity.Option;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OptionMapper {
    @Mapping(source = "monster.name", target = "monsterName")
    OptionResponse toResponse(Option option);
}
