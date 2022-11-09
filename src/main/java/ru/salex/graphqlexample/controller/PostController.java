package ru.salex.graphqlexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.salex.graphqlexample.dto.PostResponse;
import ru.salex.graphqlexample.service.PostService;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PostController {
    @Autowired
    private PostService postService;

    @QueryMapping
    public List<PostResponse> findAllPost() {
        return postService.findALl();
    }

    @QueryMapping
    public Optional<PostResponse> findPostById(@Argument Long id) {
        return postService.findById(id);
    }

}
