package service.bookwallet.datasources.dto;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "subject")
public class SubjectDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_subject_PK")
    private UUID idSubject;

    @Column(name = "title")
    private String title;

    public SubjectDto() {
    }

    public SubjectDto(UUID idSubject, String title) {
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

    @Override
    public String toString() {
        return "SubjectDto{" +
                "idSubject=" + idSubject +
                ", title='" + title + '\'' +
                '}';
    }
}
