package service.bookwallet.transportlayers.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.bookwallet.entities.Subject;
import service.bookwallet.interactors.SubjectUseCase;
import service.bookwallet.transportlayers.mapper.SubjectPayloadMapper;
import service.bookwallet.transportlayers.payload.SubjectPayload;

import java.util.UUID;

@RestController
@RequestMapping("/v1/subject")
public class SubjectController {

    private final SubjectUseCase subjectUseCase;

    private final SubjectPayloadMapper subjectPayloadMapper;

    public SubjectController(SubjectUseCase subjectUseCase, SubjectPayloadMapper subjectPayloadMapper){
        this.subjectUseCase = subjectUseCase;
        this.subjectPayloadMapper = subjectPayloadMapper;
    }

    @PostMapping
    public ResponseEntity<Subject> insertSubject(@RequestBody SubjectPayload payload){
        Subject subjectPayload = subjectPayloadMapper.mapPayloadToSubject(payload);
        Subject subjectResponse = subjectUseCase.insertSubject(subjectPayload);
        return ResponseEntity.ok(subjectResponse);
    }

    @GetMapping
    public ResponseEntity getSubjectById(UUID idSubject){

        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity listAllSubject(){

        return ResponseEntity.ok().build();
    }

}
