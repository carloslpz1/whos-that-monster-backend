package com.group2.whos_that_monster.repository;

import com.group2.whos_that_monster.entity.Trivia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TriviaRepository extends JpaRepository<Trivia, Long> {
    @Query(value = "SELECT * FROM trivia ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Trivia findRandom();
}
