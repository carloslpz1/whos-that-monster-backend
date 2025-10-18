package com.group2.whos_that_monster.controller;


import com.group2.whos_that_monster.dto.monster.MonsterDTOResponse;
import com.group2.whos_that_monster.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/monster")
public class MonsterController {

    private final MonsterService monsterService;

    // save
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<MonsterDTOResponse> saveMonster(
            @RequestParam("name") String name,
            @RequestParam("imageReal") MultipartFile imangeReal,
            @RequestParam("imageSilhouette") MultipartFile imageSilhouette) throws IOException {

        MonsterDTOResponse response = monsterService.saveMonster(name, imangeReal, imageSilhouette);
        return ResponseEntity.created(null).body(response);
    }
}
