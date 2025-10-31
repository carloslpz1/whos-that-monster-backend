-- Monsters
INSERT INTO monsters (id, name, image_url, silhouette) VALUES
(1, 'Bruja', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761153828/sjzgxkd6pubxynqi5f2f.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761153826/ficzakzridvodamhn5fg.webp'),
(2, 'Cthulhu', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154016/ki8pdpfuotthxulzmizk.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154014/igct1pqe9gvl8pzzpj84.webp'),
(3, 'Diablo', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154184/ddo0gl9xxk9ul6tzsclq.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154182/csxosd6c3cooqhtjfyd2.webp'),
(4, 'Dracula', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154221/zu5wnkzomhhbflcy6lra.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761154220/a5mkvh41zdsaumwnac29.webp'),
(5, 'Fantasma', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761158350/dzzpdd1gkkcvpkq0wol6.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761158348/c7tsqwuwtpuuc34km0gd.webp'),
(6, 'Frankestein', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761928593/ezgwbd2qr2l7zprhmiry.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155741/stsbaismah123v1sxzc6.webp'),
(7, 'Gremlin', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155778/l6xceand8sy84hs5p4qo.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155776/w8wfpazgtfhznxecgzcm.webp'),
(8, 'Hombre Lobo', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155843/aehf8d3pre2nhq0cgcwt.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155842/t6jnh791yaeehgvv86wj.webp'),
(9, 'Medusa', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155911/liavryzjmswzxucan0du.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155910/vp5nqviqdzfshbn0v2y4.webp'),
(10, 'Momia', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155936/heayzyub1vd4mgo4enj7.webp', 'https://res.cloudinary.com/dfofbqqlg/image/upload/v1761155934/dvstx965u6rjvatjojmm.webp');

-- 1. Bruja
INSERT INTO trivia (id, monster_id, created_at) VALUES (1, 1, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(1, TRUE, 1, 1),
(2, FALSE, 1, 3),
(3, FALSE, 1, 5),
(4, FALSE, 1, 8);

-- 2. Cthulhu
INSERT INTO trivia (id, monster_id, created_at) VALUES (2, 2, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(5, TRUE, 2, 2),
(6, FALSE, 2, 9),
(7, FALSE, 2, 10),
(8, FALSE, 2, 4);

-- 3. Diablo
INSERT INTO trivia (id, monster_id, created_at) VALUES (3, 3, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(9, TRUE, 3, 3),
(10, FALSE, 3, 1),
(11, FALSE, 3, 6),
(12, FALSE, 3, 7);

-- 4. Dracula
INSERT INTO trivia (id, monster_id, created_at) VALUES (4, 4, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(13, TRUE, 4, 4),
(14, FALSE, 4, 2),
(15, FALSE, 4, 5),
(16, FALSE, 4, 8);

-- 5. Fantasma
INSERT INTO trivia (id, monster_id, created_at) VALUES (5, 5, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(17, TRUE, 5, 5),
(18, FALSE, 5, 1),
(19, FALSE, 5, 6),
(20, FALSE, 5, 9);

-- 6. Frankestein
INSERT INTO trivia (id, monster_id, created_at) VALUES (6, 6, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(21, TRUE, 6, 6),
(22, FALSE, 6, 4),
(23, FALSE, 6, 7),
(24, FALSE, 6, 10);

-- 7. Gremlin
INSERT INTO trivia (id, monster_id, created_at) VALUES (7, 7, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(25, TRUE, 7, 7),
(26, FALSE, 7, 2),
(27, FALSE, 7, 3),
(28, FALSE, 7, 9);

-- 8. Hombre Lobo
INSERT INTO trivia (id, monster_id, created_at) VALUES (8, 8, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(29, TRUE, 8, 8),
(30, FALSE, 8, 1),
(31, FALSE, 8, 4),
(32, FALSE, 8, 6);

-- 9. Medusa
INSERT INTO trivia (id, monster_id, created_at) VALUES (9, 9, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(33, TRUE, 9, 9),
(34, FALSE, 9, 3),
(35, FALSE, 9, 7),
(36, FALSE, 9, 10);

-- 10. Momia
INSERT INTO trivia (id, monster_id, created_at) VALUES (10, 10, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(37, TRUE, 10, 10),
(38, FALSE, 10, 5),
(39, FALSE, 10, 6),
(40, FALSE, 10, 8);

-- 11. Bruja (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (11, 1, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(41, TRUE, 11, 1),
(42, FALSE, 11, 9),
(43, FALSE, 11, 2),
(44, FALSE, 11, 7);

-- 12. Cthulhu (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (12, 2, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(45, TRUE, 12, 2),
(46, FALSE, 12, 6),
(47, FALSE, 12, 1),
(48, FALSE, 12, 3);

-- 13. Diablo (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (13, 3, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(49, TRUE, 13, 3),
(50, FALSE, 13, 4),
(51, FALSE, 13, 8),
(52, FALSE, 13, 10);

-- 14. Dracula (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (14, 4, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(53, TRUE, 14, 4),
(54, FALSE, 14, 1),
(55, FALSE, 14, 6),
(56, FALSE, 14, 9);

-- 15. Fantasma (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (15, 5, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(57, TRUE, 15, 5),
(58, FALSE, 15, 2),
(59, FALSE, 15, 3),
(60, FALSE, 15, 8);

-- 16. Frankestein (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (16, 6, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(61, TRUE, 16, 6),
(62, FALSE, 16, 1),
(63, FALSE, 16, 5),
(64, FALSE, 16, 10);

-- 17. Gremlin (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (17, 7, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(65, TRUE, 17, 7),
(66, FALSE, 17, 3),
(67, FALSE, 17, 4),
(68, FALSE, 17, 8);

-- 18. Hombre Lobo (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (18, 8, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(69, TRUE, 18, 8),
(70, FALSE, 18, 2),
(71, FALSE, 18, 5),
(72, FALSE, 18, 9);

-- 19. Medusa (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (19, 9, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(73, TRUE, 19, 9),
(74, FALSE, 19, 1),
(75, FALSE, 19, 6),
(76, FALSE, 19, 10);

-- 20. Momia (variación)
INSERT INTO trivia (id, monster_id, created_at) VALUES (20, 10, NOW());
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(77, TRUE, 20, 10),
(78, FALSE, 20, 2),
(79, FALSE, 20, 3),
(80, FALSE, 20, 7);
