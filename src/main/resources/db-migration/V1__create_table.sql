-- Alterar tipo de dados para UUID nas tabelas

CREATE TABLE subject (
  id_subject_PK UUID PRIMARY KEY,
  title VARCHAR(150)
);

CREATE TABLE user_reader (
  id_user_reader_PK UUID PRIMARY KEY,
  username VARCHAR(100),
  email VARCHAR(150),
  pass VARCHAR(100),
  is_library_public BOOLEAN
);

CREATE TABLE author (
  id_author_PK UUID PRIMARY KEY,
  nickname VARCHAR(100)
);

CREATE TABLE book (
  id_book_PK UUID PRIMARY KEY,
  id_author_FK UUID,
  id_subject_FK UUID,
  title VARCHAR(100),
  cover_path VARCHAR(255),
  FOREIGN KEY (id_author_FK) REFERENCES author(id_author_PK),
  FOREIGN KEY (id_subject_FK) REFERENCES subject(id_subject_PK)
);

CREATE TABLE user_reader_book (
  id_user_reader_FK UUID,
  id_book_FK UUID,
  rating INT,
  summary TEXT,
  is_book_read BOOLEAN,
  PRIMARY KEY(id_user_reader_FK, id_book_FK),
  FOREIGN KEY (id_user_reader_FK) REFERENCES user_reader(id_user_reader_PK),
  FOREIGN KEY (id_book_FK) REFERENCES book(id_book_PK)
);
