package service.bookwallet.transportlayers.mapper;

import org.mapstruct.Mapper;
import service.bookwallet.entities.Author;
import service.bookwallet.transportlayers.payload.AuthorPayload;

@Mapper(componentModel = "spring")
public interface AuthorPayloadMapper {

    Author mapPayloadToAuthor(AuthorPayload authorPayload);

}
