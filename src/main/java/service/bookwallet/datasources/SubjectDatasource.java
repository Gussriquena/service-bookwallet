package service.bookwallet.datasources;

import org.springframework.stereotype.Component;
import service.bookwallet.datasources.data.SubjectJpaRepository;
import service.bookwallet.datasources.dto.SubjectDto;
import service.bookwallet.datasources.mapper.SubjectMapper;
import service.bookwallet.entities.Subject;
import service.bookwallet.repositories.SubjectRepository;

import java.util.List;
import java.util.UUID;

@Component
public class SubjectDatasource implements SubjectRepository {

    private final SubjectJpaRepository subjectJpaRepository;
    private final SubjectMapper subjectMapper;

    public SubjectDatasource(SubjectJpaRepository subjectJpaRepository, SubjectMapper subjectMapper){
        this.subjectJpaRepository = subjectJpaRepository;
        this.subjectMapper = subjectMapper;
    }

    @Override
    public Subject insertSubject(Subject subject) {
        SubjectDto subjectDto = subjectMapper.mapSubjectToDto(subject);
        SubjectDto subjectResponse = subjectJpaRepository.save(subjectDto);
        return subjectMapper.mapDtoToSubject(subjectResponse);
    }

    @Override
    public Subject getSubject(UUID idSubject) {
        return null;
    }

    @Override
    public List<Subject> listAllSubject() {
        return null;
    }
}
