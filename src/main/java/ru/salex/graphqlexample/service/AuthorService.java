package ru.salex.graphqlexample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.salex.graphqlexample.domain.Author;
import ru.salex.graphqlexample.dto.AuthorResponse;
import ru.salex.graphqlexample.mapper.AuthorMapper;
import ru.salex.graphqlexample.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;

    public List<AuthorResponse> findALl() {
        return authorRepository.findAll().stream().map(authorMapper::mapToDto).collect(Collectors.toList());
    }

    public Optional<AuthorResponse> findById(Long id) {
        return authorRepository.findById(id).map(authorMapper::mapToDto);
    }

}
