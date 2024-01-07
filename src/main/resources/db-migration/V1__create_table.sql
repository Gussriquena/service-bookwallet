CREATE TABLE subject (
  id_subject_PK INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(150)
);

CREATE TABLE user_reader (
  id_user_reader_PK INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100),
  email VARCHAR(150),
  pass VARCHAR(100),
  is_library_public BOOLEAN
);

CREATE TABLE author (
  id_author_PK INT AUTO_INCREMENT PRIMARY KEY,
  nickname VARCHAR(100)
);

CREATE TABLE book (
  id_book_PK INT AUTO_INCREMENT PRIMARY KEY,
  id_author_FK INT,
  id_subject_FK INT,
  title VARCHAR(100),
  cover_path VARCHAR(255),
  FOREIGN KEY (id_author_FK) REFERENCES author(id_author_PK),
  FOREIGN KEY (id_subject_FK) REFERENCES subject(id_subject_PK)
);

CREATE TABLE user_reader_book (
  id_user_reader_FK INT NOT NULL,
  id_book_FK INT NOT NULL,
  rating INT,
  summary TEXT,
  is_book_read BOOLEAN,
  PRIMARY KEY(id_user_reader_FK, id_book_FK),
  FOREIGN KEY (id_user_reader_FK) REFERENCES user_reader(id_user_reader_PK),
  FOREIGN KEY (id_book_FK) REFERENCES book(id_book_PK)
);
