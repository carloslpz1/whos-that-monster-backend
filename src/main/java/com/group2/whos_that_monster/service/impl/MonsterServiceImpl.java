package com.group2.whos_that_monster.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.group2.whos_that_monster.dto.monster.MonsterDTOResponse;
import com.group2.whos_that_monster.entity.Monster;
import com.group2.whos_that_monster.mapper.MonsterMapper;
import com.group2.whos_that_monster.repository.MonsterRepo;
import com.group2.whos_that_monster.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MonsterServiceImpl implements MonsterService {


    private final MonsterRepo monsterRepo;
    private final Cloudinary cloudinary;
    private final MonsterMapper monsterMapper;

    @Override
    public MonsterDTOResponse saveMonster(String monsterName, MultipartFile imageReal , MultipartFile imageSilhouette) {

        try {
            // Validate
            if (monsterName == null || monsterName.isBlank()) {
                throw new IllegalArgumentException("name mosnter is required");
            }

            // up imgReal
            String imageRealUrl = null;
            if (imageReal != null && !imageReal.isEmpty()) {
                Map<?, ?> resSilueta = cloudinary.uploader()
                        .upload(imageReal.getBytes(), ObjectUtils.emptyMap());
                imageRealUrl = resSilueta.get("secure_url").toString();
            }

            // up imagenSilh
            String imageSilhouetteUrl = null;
            if (imageSilhouette != null && !imageSilhouette.isEmpty()) {
                Map<?, ?> resReal = cloudinary.uploader()
                        .upload(imageSilhouette.getBytes(), ObjectUtils.emptyMap());
                imageSilhouetteUrl = resReal.get("secure_url").toString();
            }

            // entity saved
            Monster monster = new Monster();
            monster.setName(monsterName);
            monster.setImageReal(imageRealUrl);
            monster.setImageSilhouette(imageSilhouetteUrl);

            Monster saved = monsterRepo.save(monster);

            // Response DTO (record)
            return  monsterMapper.toMonsterDTOResponse(saved);
        } catch (Exception e) {
            throw new RuntimeException("Error create Monster: " + e.getMessage(), e);
        }
    }
}
