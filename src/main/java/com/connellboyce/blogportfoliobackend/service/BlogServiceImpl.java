package com.connellboyce.blogportfoliobackend.service;

import com.connellboyce.blogportfoliobackend.model.Blog;
import com.connellboyce.blogportfoliobackend.payload.request.BlogPostRequest;
import com.connellboyce.blogportfoliobackend.payload.response.MessageResponse;
import com.connellboyce.blogportfoliobackend.repository.BlogRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public ResponseEntity<?> postBlogEntry(BlogPostRequest blogPostRequest) {
        Blog post = new Blog();
        post.setTitle(blogPostRequest.getTitle());
        post.setBody(blogPostRequest.getBody());
        blogRepository.save(post);
        if (post.getBody() == null || post.getTitle() == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(new MessageResponse("Post blogged successfully!"));
    }
}
