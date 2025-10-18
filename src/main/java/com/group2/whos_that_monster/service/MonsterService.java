package com.group2.whos_that_monster.service;

import com.group2.whos_that_monster.dto.monster.MonsterDTOResponse;
import org.springframework.web.multipart.MultipartFile;

public interface MonsterService {

    // post
    public MonsterDTOResponse saveMonster(String monsterName, MultipartFile monsterImage , MultipartFile monsterImageFile);

}
