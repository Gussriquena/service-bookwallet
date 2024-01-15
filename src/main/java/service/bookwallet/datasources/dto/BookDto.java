package service.bookwallet.datasources.dto;

import jakarta.persistence.*;

import java.util.UUID;

@Table
@Entity(name = "book")
public class BookDto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_book_PK")
    private UUID idBook;

    private String title;
    private String coverPath;

    @ManyToOne
    private AuthorDto author;

    @OneToOne
    private SubjectDto subject;

    public BookDto() {
    }

    public BookDto(UUID idBook, String title, String coverPath, AuthorDto author, SubjectDto subject) {
        this.idBook = idBook;
        this.title = title;
        this.coverPath = coverPath;
        this.author = author;
        this.subject = subject;
    }

    public UUID getIdBook() {
        return idBook;
    }

    public void setIdBook(UUID idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }

    public SubjectDto getSubject() {
        return subject;
    }

    public void setSubject(SubjectDto subject) {
        this.subject = subject;
    }
}
