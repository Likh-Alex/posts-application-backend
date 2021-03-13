package com.dev.postsapp.entity;

import lombok.Data;

@Data
public class Post {
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
