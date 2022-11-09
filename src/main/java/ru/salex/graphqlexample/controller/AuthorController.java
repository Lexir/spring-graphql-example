package ru.salex.graphqlexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.salex.graphqlexample.dto.AuthorResponse;
import ru.salex.graphqlexample.service.AuthorService;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @QueryMapping
    public List<AuthorResponse> findAllAuthor() {
        return authorService.findALl();
    }

    @QueryMapping
    public Optional<AuthorResponse> findAuthorById(@Argument Long id) {
        return authorService.findById(id);
    }

}
