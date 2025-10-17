package com.group2.whos_that_monster.repository;

import com.group2.whos_that_monster.model.Trivia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriviaRepository extends JpaRepository<Trivia, Long> {
}
