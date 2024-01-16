package service.bookwallet.datasources.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.bookwallet.datasources.dto.SubjectDto;
import service.bookwallet.entities.Subject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SubjectJpaRepository extends JpaRepository<SubjectDto, UUID> {

    SubjectDto save(Subject subject);

    Optional<SubjectDto> findByIdSubject(UUID idSubject);

    List<SubjectDto> findAll();



}
