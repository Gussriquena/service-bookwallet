package service.bookwallet.datasources.dto;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_reader")
public class UserReaderDto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_user_reader_PK")
    private UUID idUserReader;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;

    @Column(name = "is_library_public")
    private Boolean isLibraryPublic;

}
