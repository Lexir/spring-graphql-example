package ru.salex.graphqlexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.salex.graphqlexample.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
