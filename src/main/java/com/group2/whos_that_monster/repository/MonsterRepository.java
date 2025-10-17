package com.group2.whos_that_monster.repository;

import com.group2.whos_that_monster.model.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
