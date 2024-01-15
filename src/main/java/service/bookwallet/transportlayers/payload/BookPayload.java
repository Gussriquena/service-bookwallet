package service.bookwallet.transportlayers.payload;

public record BookPayload(
        String title,
        String coverPath,
        Integer rating,
        String summary,
        Boolean isBookRead,
        AuthorPayload author,
        SubjectPayload subject
) {
}
