package service.bookwallet.datasources.mapper;

import org.mapstruct.Mapper;
import service.bookwallet.datasources.dto.SubjectDto;
import service.bookwallet.entities.Subject;

@Mapper(componentModel = "spring")
public interface SubjectMapper {

    Subject mapDtoToSubject(SubjectDto subjectDto);

    SubjectDto mapSubjectToDto(Subject subject);

}
