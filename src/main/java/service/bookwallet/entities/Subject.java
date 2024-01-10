package service.bookwallet.entities;

import java.util.UUID;

public class Subject {
    private UUID idSubject;
    private String title;

    public Subject() {
    }

    public Subject(String title) {
        this.title = title;
    }

    public Subject(UUID idSubject, String title) {
        this.idSubject = idSubject;
        this.title = title;
    }

    public UUID getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(UUID idSubject) {
        this.idSubject = idSubject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
