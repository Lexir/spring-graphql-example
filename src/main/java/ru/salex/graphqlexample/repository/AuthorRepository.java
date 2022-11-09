package ru.salex.graphqlexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.salex.graphqlexample.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
