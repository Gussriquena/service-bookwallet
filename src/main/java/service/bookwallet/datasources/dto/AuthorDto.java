package service.bookwallet.datasources.dto;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "author")
public class AuthorDto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_author_PK")
    private UUID idAuthor;

    @Column(name = "nickName")
    private String nickName;

    public AuthorDto() {
    }

    public AuthorDto(UUID idAuthor, String nickName) {
        this.idAuthor = idAuthor;
        this.nickName = nickName;
    }

    public UUID getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(UUID idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "idAuthor=" + idAuthor +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
