
INSERT INTO client (name) VALUES ('Alice');
INSERT INTO client (name) VALUES ('Bob');
INSERT INTO client (name) VALUES ('Charlie');
INSERT INTO client (name) VALUES ('David');
INSERT INTO client (name) VALUES ('Eve');
INSERT INTO client (name) VALUES ('Frank');
INSERT INTO client (name) VALUES ('Grace');
INSERT INTO client (name) VALUES ('Hank');
INSERT INTO client (name) VALUES ('Ivy');
INSERT INTO client (name) VALUES ('Jack');

INSERT INTO planet (id, name) VALUES ('MARS', 'Mars');
INSERT INTO planet (id, name) VALUES ('VEN', 'Venus');
INSERT INTO planet (id, name) VALUES ('EARTH', 'Earth');
INSERT INTO planet (id, name) VALUES ('JUP', 'Jupiter');
INSERT INTO planet (id, name) VALUES ('SAT', 'Saturn');

INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 1, 'EARTH', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 2, 'EARTH', 'VEN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 3, 'MARS', 'JUP');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 4, 'VEN', 'SAT');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 5, 'EARTH', 'JUP');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 6, 'JUP', 'SAT');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 7, 'MARS', 'VEN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 8, 'VEN', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 9, 'EARTH', 'SAT');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (NOW(), 10, 'MARS', 'EARTH');
                        