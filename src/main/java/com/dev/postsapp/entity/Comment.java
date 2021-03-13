package com.dev.postsapp.entity;

import lombok.Data;

@Data
public class Comment {
    private Long id;
    private Long postId;
    private String name;
    private String userEmail;
    private String body;
}
