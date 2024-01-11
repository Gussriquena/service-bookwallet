package service.bookwallet.transportlayers.api;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.bookwallet.entities.Book;
import service.bookwallet.transportlayers.payload.BookPayload;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @PostMapping
    public ResponseEntity<Book> insertBook(@RequestBody BookPayload payload){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Book> getBookByIdOrTitle(@Param("idBook") UUID idBook, @Param("title") String title){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> listAllBooksByUser(@RequestHeader("idUserReader") UUID idUserReader){
        // TODO: Implements method
        return ResponseEntity.ok().build();
    }

}
