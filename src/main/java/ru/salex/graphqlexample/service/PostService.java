package ru.salex.graphqlexample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.salex.graphqlexample.dto.PostResponse;
import ru.salex.graphqlexample.mapper.PostMapper;
import ru.salex.graphqlexample.repository.PostRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostMapper postMapper;
    private final PostRepository postRepository;

    public List<PostResponse> findALl() {
        return postRepository.findAll().stream().map(postMapper::mapToDto).collect(Collectors.toList());
    }

    public Optional<PostResponse> findById(Long id) {
        return postRepository.findById(id).map(postMapper::mapToDto);
    }

}
