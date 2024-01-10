package service.bookwallet.entities;

import java.util.UUID;

public class Author {
    private UUID idAuthor;
    private String nickName;

    public Author() {
    }

    public Author(String nickName) {
        this.nickName = nickName;
    }

    public Author(UUID idAuthor, String nickName) {
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
}
