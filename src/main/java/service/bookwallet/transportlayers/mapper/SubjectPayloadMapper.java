package service.bookwallet.transportlayers.mapper;

import org.springframework.stereotype.Service;
import service.bookwallet.entities.Subject;
import service.bookwallet.transportlayers.payload.SubjectPayload;

import java.util.UUID;

@Service
public class SubjectPayloadMapper {

    public Subject mapPayloadToSubject(SubjectPayload subjectPayload) {
        return new Subject(UUID.randomUUID(), subjectPayload.title());
    }

}
