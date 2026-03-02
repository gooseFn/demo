package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        return List.of(
            new Post("Пост номер 1"),
            new Post("Пост номер 2"),
            new Post("Пост номер 3")
        );
    }
}
