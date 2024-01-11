package service.bookwallet.transportlayers.payload;

import com.google.gson.JsonObject;

public record BookPayload(
        String title,
        String coverPath,
        Integer rating,
        String summary,
        Boolean isBookRead,
        JsonObject author,
        JsonObject subject
) {
}
