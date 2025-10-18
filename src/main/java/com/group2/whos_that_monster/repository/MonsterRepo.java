package com.group2.whos_that_monster.repository;


import com.group2.whos_that_monster.entity.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepo extends JpaRepository<Monster, Long> {
}
