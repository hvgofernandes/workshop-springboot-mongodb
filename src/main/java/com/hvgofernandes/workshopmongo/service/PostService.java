package com.hvgofernandes.workshopmongo.service;

import com.hvgofernandes.workshopmongo.domain.Post;
import com.hvgofernandes.workshopmongo.domain.User;
import com.hvgofernandes.workshopmongo.repository.PostRepository;
import com.hvgofernandes.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
