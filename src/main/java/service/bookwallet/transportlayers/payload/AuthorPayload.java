package service.bookwallet.transportlayers.payload;

import java.util.UUID;

public record AuthorPayload(
        UUID idAuthor,
        String nickName
) {
}
