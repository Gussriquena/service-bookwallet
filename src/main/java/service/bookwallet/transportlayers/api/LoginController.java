package service.bookwallet.transportlayers.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.bookwallet.transportlayers.payload.UserCredentialsPayload;
import service.bookwallet.transportlayers.payload.UserReaderPayload;

@RestController
@RequestMapping("/v1/login")
public class LoginController {

    @PostMapping("/register")
    public ResponseEntity insertUserReader(@RequestBody UserReaderPayload payload){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity authenticateUserReader(@RequestBody UserCredentialsPayload payload){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

}
