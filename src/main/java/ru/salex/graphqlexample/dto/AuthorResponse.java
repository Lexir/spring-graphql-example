package ru.salex.graphqlexample.dto;

public record AuthorResponse(Long id,
                             String username,
                             String firstname,
                             String lastname,
                             String displayName,
                             String email) {
}
