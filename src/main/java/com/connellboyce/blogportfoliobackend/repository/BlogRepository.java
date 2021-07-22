package com.connellboyce.blogportfoliobackend.repository;

import com.connellboyce.blogportfoliobackend.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BlogRepository extends MongoRepository<Blog, String> {
    Optional<Blog> findByTitle(String title);
    Optional<Blog> findById(String title);
}
