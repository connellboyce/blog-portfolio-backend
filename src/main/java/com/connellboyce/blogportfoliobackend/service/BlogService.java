package com.connellboyce.blogportfoliobackend.service;

import com.connellboyce.blogportfoliobackend.payload.request.BlogPostRequest;
import org.springframework.http.ResponseEntity;

public interface BlogService {
    public ResponseEntity<?> postBlogEntry(BlogPostRequest blogPostRequest);
}
