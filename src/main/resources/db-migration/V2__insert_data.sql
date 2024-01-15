-- Inserir exemplos para a tabela 'subject'
INSERT INTO subject (id_subject_PK, title) VALUES
  ('11111111-1111-1111-1111-111111111111', 'Fantasy'),
  ('22222222-2222-2222-2222-222222222222', 'Science Fiction'),
  ('33333333-3333-3333-3333-333333333333', 'Mystery');

-- Inserir exemplos para a tabela 'author'
INSERT INTO author (id_author_PK, nickname) VALUES
  ('44444444-4444-4444-4444-444444444444', 'J.K. Rowling'),
  ('55555555-5555-5555-5555-555555555555', 'Isaac Asimov'),
  ('66666666-6666-6666-6666-666666666666', 'Agatha Christie');

-- Inserir exemplos para a tabela 'user_reader'
INSERT INTO user_reader (id_user_reader_PK, username, email, pass, is_library_public) VALUES
  ('77777777-7777-7777-7777-777777777777', 'booklover123', 'booklover@example.com', 'password123', true),
  ('88888888-8888-8888-8888-888888888888', 'sci_fi_fanatic', 'scifi@example.com', 'securepass', false),
  ('99999999-9999-9999-9999-999999999999', 'mystery_enthusiast', 'mystery@example.com', 'secretpassword', true);

-- Inserir exemplos para a tabela 'book'
INSERT INTO book (id_book_PK, id_author_FK, id_subject_FK, title, cover_path) VALUES
  ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '44444444-4444-4444-4444-444444444444', '11111111-1111-1111-1111-111111111111', 'Harry Potter and the Philosopher''s Stone', '/covers/hp1.jpg'),
  ('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', '55555555-5555-5555-5555-555555555555', '22222222-2222-2222-2222-222222222222', 'Foundation', '/covers/foundation.jpg'),
  ('cccccccc-cccc-cccc-cccc-cccccccccccc', '66666666-6666-6666-6666-666666666666', '33333333-3333-3333-3333-333333333333', 'Murder on the Orient Express', '/covers/murder_orient_express.jpg');

-- Inserir exemplos para a tabela 'user_reader_book'
INSERT INTO user_reader_book (id_user_reader_FK, id_book_FK, rating, summary, is_book_read) VALUES
  ('77777777-7777-7777-7777-777777777777', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 5, 'Amazing book! Loved the magical world.', true),
  ('88888888-8888-8888-8888-888888888888', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 4, 'Great sci-fi classic.', true),
  ('99999999-9999-9999-9999-999999999999', 'cccccccc-cccc-cccc-cccc-cccccccccccc', 3, 'Interesting mystery plot.', false);
