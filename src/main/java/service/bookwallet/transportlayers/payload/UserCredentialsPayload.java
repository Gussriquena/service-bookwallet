package service.bookwallet.transportlayers.payload;

public record UserCredentialsPayload(
        String username,
        String pass
) {
}
