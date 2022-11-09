package ru.salex.graphqlexample.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.salex.graphqlexample.domain.Post;
import ru.salex.graphqlexample.dto.PostResponse;

@Component
@RequiredArgsConstructor
public class PostMapper {

    private final AuthorMapper authorMapper;

    public PostResponse mapToDto(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getMessage(), authorMapper.mapToDto(post.getAuthor()));
    }
}
