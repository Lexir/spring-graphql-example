package ru.salex.graphqlexample.dto;

public record PostResponse(Long id,
                           String title,
                           String message,
                           AuthorResponse author) {
}
