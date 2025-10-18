package com.group2.whos_that_monster.mapper;

import com.group2.whos_that_monster.dto.monster.MonsterDTOResponse;
import com.group2.whos_that_monster.entity.Monster;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MonsterMapper {


    // dtores <- entity
    MonsterDTOResponse toMonsterDTOResponse(Monster monster);

}