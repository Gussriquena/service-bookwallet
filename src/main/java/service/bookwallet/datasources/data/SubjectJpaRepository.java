package service.bookwallet.datasources.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.bookwallet.datasources.dto.SubjectDto;
import service.bookwallet.entities.Subject;

import java.util.UUID;

@Repository
public interface SubjectJpaRepository extends JpaRepository<SubjectDto, UUID> {

    SubjectDto save(Subject subject);

}
