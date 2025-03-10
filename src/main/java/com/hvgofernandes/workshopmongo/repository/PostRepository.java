package com.hvgofernandes.workshopmongo.repository;

import com.hvgofernandes.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository <Post, String> {
}
