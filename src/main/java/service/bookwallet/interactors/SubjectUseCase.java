package service.bookwallet.interactors;

import org.springframework.stereotype.Service;
import service.bookwallet.entities.Subject;
import service.bookwallet.repositories.SubjectRepository;

import java.util.List;
import java.util.UUID;

@Service
public class SubjectUseCase {

    private final SubjectRepository subjectRepository;

    public SubjectUseCase(SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    public Subject insertSubject(Subject subject){
        return subjectRepository.insertSubject(subject);
    }

    public Subject getSubject(UUID idSubject){
        return null;
    }

    public List<Subject> listAllSubject(){
        return null;
    }

}
