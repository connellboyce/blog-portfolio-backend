package com.connellboyce.blogportfoliobackend.controller;

import com.connellboyce.blogportfoliobackend.payload.request.BlogPostRequest;
import com.connellboyce.blogportfoliobackend.repository.BlogRepository;
import com.connellboyce.blogportfoliobackend.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    BlogService blogService;

    @Autowired
    BlogRepository blogRepository;

    @PostMapping("/post")
    public ResponseEntity<?> postBlog(@Valid @RequestBody BlogPostRequest blogPostRequest) {
        return blogService.postBlogEntry(blogPostRequest);
    }
}
