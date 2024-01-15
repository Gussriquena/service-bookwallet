package service.bookwallet.transportlayers.payload;

import java.util.UUID;

public record SubjectPayload(
        UUID idSubject,
        String title
) {
}
