package ru.salex.graphqlexample.mapper;

import org.springframework.stereotype.Component;
import ru.salex.graphqlexample.domain.Author;
import ru.salex.graphqlexample.dto.AuthorResponse;

@Component
public class AuthorMapper {
    public AuthorResponse mapToDto(Author author) {
        return new AuthorResponse(author.getId(),
                author.getUsername(),
                author.getFirstname(),
                author.getLastname(),
                author.getFirstname() + ":" + author.getLastname(),
                author.getEmail());
    }
}
