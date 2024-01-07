INSERT INTO subject (title) VALUES
  ('Fantasy'),
  ('Science Fiction'),
  ('Mystery');

INSERT INTO author (nickname) VALUES
  ('J.K. Rowling'),
  ('Isaac Asimov'),
  ('Agatha Christie');

INSERT INTO user_reader (username, email, pass, is_library_public) VALUES
  ('booklover123', 'booklover@example.com', 'password123', true),
  ('sci_fi_fanatic', 'scifi@example.com', 'securepass', false),
  ('mystery_enthusiast', 'mystery@example.com', 'secretpassword', true);

INSERT INTO book (id_author_FK, id_subject_FK, title, cover_path) VALUES
  (1, 1, 'Harry Potter and the Philosopher''s Stone', '/covers/hp1.jpg'),
  (2, 2, 'Foundation', '/covers/foundation.jpg'),
  (3, 3, 'Murder on the Orient Express', '/covers/murder_orient_express.jpg');

INSERT INTO user_reader_book (id_user_reader_FK, id_book_FK, rating, summary, is_book_read) VALUES
  (1, 1, 5, 'Amazing book! Loved the magical world.', true),
  (2, 2, 4, 'Great sci-fi classic.', true),
  (3, 3, 3, 'Interesting mystery plot.', false);
