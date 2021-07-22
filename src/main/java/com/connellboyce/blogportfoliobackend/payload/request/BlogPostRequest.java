package com.connellboyce.blogportfoliobackend.payload.request;

import javax.validation.constraints.NotBlank;

public class BlogPostRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String body;


    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
