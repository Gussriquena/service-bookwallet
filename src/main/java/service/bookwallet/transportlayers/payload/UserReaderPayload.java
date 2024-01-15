package service.bookwallet.transportlayers.payload;

public record UserReaderPayload(
        String username,
        String email,
        String pass
) {
}
