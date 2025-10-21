package com.group2.whos_that_monster.mapper;

import com.group2.whos_that_monster.dto.trivia.TriviaResponse;
import com.group2.whos_that_monster.entity.Option;
import com.group2.whos_that_monster.entity.Trivia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = OptionMapper.class)
public interface TriviaMapper {

    @Mapping(source = "monster.silhouetteURL", target = "silhouetteURL")
    @Mapping(source = "options", target = "options")
    @Mapping(source = "options", target = "correctAnswer", qualifiedByName = "mapCorrectAnswerId")
    TriviaResponse toResponse(Trivia trivia);

    List<TriviaResponse> toResponseList(List<Trivia> trivia);

    @Named("mapCorrectAnswerId")
    default Long mapCorrectAnswerId(List<Option> options) {
        if (options == null) return null;
        return options.stream()
                .filter(Option::getIsCorrect)
                .findFirst()
                .map(Option::getId)
                .orElse(null);
    }
}
