INSERT INTO monsters (id, name, image_url, silhouette) VALUES
(1, 'Pikachu', 'https://example.com/images/pikachu.png', 'https://example.com/silhouettes/pikachu.png'),
(2, 'Charmander', 'https://example.com/images/charmander.png', 'https://example.com/silhouettes/charmander.png'),
(3, 'Bulbasaur', 'https://example.com/images/bulbasaur.png', 'https://example.com/silhouettes/bulbasaur.png'),
(4, 'Squirtle', 'https://example.com/images/squirtle.png', 'https://example.com/silhouettes/squirtle.png'),
(5, 'Jigglypuff', 'https://example.com/images/jigglypuff.png', 'https://example.com/silhouettes/jigglypuff.png'),
(6, 'Meowth', 'https://example.com/images/meowth.png', 'https://example.com/silhouettes/meowth.png'),
(7, 'Psyduck', 'https://example.com/images/psyduck.png', 'https://example.com/silhouettes/psyduck.png'),
(8, 'Snorlax', 'https://example.com/images/snorlax.png', 'https://example.com/silhouettes/snorlax.png'),
(9, 'Eevee', 'https://example.com/images/eevee.png', 'https://example.com/silhouettes/eevee.png'),
(10, 'Mewtwo', 'https://example.com/images/mewtwo.png', 'https://example.com/silhouettes/mewtwo.png');

INSERT INTO trivia (id, monster_id, created_at) VALUES
(1, 1, NOW()), -- Pikachu
(2, 2, NOW()), -- Charmander
(3, 3, NOW()), -- Bulbasaur
(4, 4, NOW()), -- Squirtle
(5, 5, NOW()); -- Jigglypuff

-- Trivia 1: Pikachu
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(1, TRUE, 1, 1),  -- Pikachu (correcta)
(2, FALSE, 1, 2), -- Charmander
(3, FALSE, 1, 3), -- Bulbasaur
(4, FALSE, 1, 4); -- Squirtle

-- Trivia 2: Charmander
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(5, TRUE, 2, 2),  -- Charmander (correcta)
(6, FALSE, 2, 1), -- Pikachu
(7, FALSE, 2, 3), -- Bulbasaur
(8, FALSE, 2, 5); -- Jigglypuff

-- Trivia 3: Bulbasaur
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(9, TRUE, 3, 3),  -- Bulbasaur (correcta)
(10, FALSE, 3, 2), -- Charmander
(11, FALSE, 3, 4), -- Squirtle
(12, FALSE, 3, 6); -- Meowth

-- Trivia 4: Squirtle
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(13, TRUE, 4, 4),  -- Squirtle (correcta)
(14, FALSE, 4, 1), -- Pikachu
(15, FALSE, 4, 3), -- Bulbasaur
(16, FALSE, 4, 7); -- Psyduck

-- Trivia 5: Jigglypuff
INSERT INTO options (id, is_correct, trivia_id, monster_id) VALUES
(17, TRUE, 5, 5),  -- Jigglypuff (correcta)
(18, FALSE, 5, 8), -- Snorlax
(19, FALSE, 5, 9), -- Eevee
(20, FALSE, 5, 10); -- Mewtwo
