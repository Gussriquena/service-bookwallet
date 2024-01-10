package service.bookwallet.transportlayers.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.bookwallet.entities.Author;
import service.bookwallet.transportlayers.mapper.AuthorPayloadMapper;
import service.bookwallet.transportlayers.payload.AuthorPayload;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/author")
public class AuthorController {

    private final AuthorPayloadMapper authorPayloadMapper;

    public AuthorController(AuthorPayloadMapper authorPayloadMapper){
        this.authorPayloadMapper = authorPayloadMapper;
    }

    @PostMapping
    public ResponseEntity<Author> insertAuthor(@RequestBody AuthorPayload payload){
        Author author = authorPayloadMapper.mapPayloadToAuthor(payload);
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Author> getAuthorById(@RequestHeader("idAuthor") UUID idAuthor){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Author>> listAllAuthors(){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

}
