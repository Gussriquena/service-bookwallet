package service.bookwallet.transportlayers.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.bookwallet.entities.UserReader;

import java.util.UUID;

@RestController
@RequestMapping("/v1/user-reader")
public class UserReaderController {

    @GetMapping
    public ResponseEntity<UserReader> getUserReaderById(@RequestHeader("idUserReader") UUID idUserReader){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<UserReader> updateUserReader(@RequestHeader("idUserReader") UUID idUserReader){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<UserReader> deleteUserReader(@RequestHeader("idUserReader") UUID idUserReader){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

}
