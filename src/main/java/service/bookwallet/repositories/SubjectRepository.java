package service.bookwallet.repositories;

import org.springframework.stereotype.Repository;
import service.bookwallet.entities.Subject;

import java.util.List;
import java.util.UUID;

@Repository
public interface SubjectRepository {

    Subject insertSubject(Subject subjectDto);

    Subject getSubject(UUID idSubject);

    List<Subject> listAllSubject();

    void deleteSubjectById(UUID idSubject);

}
