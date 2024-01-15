package service.bookwallet.transportlayers.mapper;

import org.mapstruct.Mapper;
import service.bookwallet.entities.Subject;
import service.bookwallet.transportlayers.payload.SubjectPayload;


@Mapper(componentModel = "spring")
public interface SubjectPayloadMapper {
    Subject mapPayloadToSubject(SubjectPayload subjectPayload);
}
