--GENRES
INSERT INTO genres (id, genre_name) VALUES (1, 'Rock');
INSERT INTO genres (id, genre_name) VALUES (2, 'Jazz');
INSERT INTO genres (id, genre_name) VALUES (3, 'Classical');
INSERT INTO genres (id, genre_name) VALUES (4, 'Hip-Hop Rap');
INSERT INTO genres (id, genre_name) VALUES (5, 'Reggae');
INSERT INTO genres (id, genre_name) VALUES (6, 'Blues');
INSERT INTO genres (id, genre_name) VALUES (7, 'Country');
INSERT INTO genres (id, genre_name) VALUES (8, 'Electronic');
INSERT INTO genres (id, genre_name) VALUES (9, 'Pop');
INSERT INTO genres (id, genre_name) VALUES (10, 'Metal');


--VENUES
INSERT INTO venues (id, venue_name, location, type, capacity) VALUES (1, 'Ziggo Dome', ' Amsterdam', 'Concert hall', 17000);
INSERT INTO venues (id, venue_name, location, type, capacity) VALUES (2, 'Royal Albert Hall', ' South Kensington - Londres', 'Theater', 9000);
INSERT INTO venues (id, venue_name, location, type, capacity) VALUES (3, 'Wembley Stadium', 'Wembley - Londres', 'stadium', 90000);


--Ticket_Categories
INSERT INTO ticket_categories (id, description, price, start_date, end_date, area)
VALUES (1, 'Lorem ipsuem dolore', 75.0, null, null, null);
INSERT INTO ticket_categories (id, description, price, start_date, end_date, area)
VALUES (2, 'Lorem ipsuem dolore', 85.0, null, null, null);
INSERT INTO ticket_categories (id, description, price, start_date, end_date, area)
VALUES (3, 'Lorem ipsuem dolore', 100.0, null, null, null);

