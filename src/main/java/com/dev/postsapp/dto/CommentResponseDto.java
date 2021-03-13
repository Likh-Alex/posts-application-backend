package com.dev.postsapp.dto;

import lombok.Data;

@Data
public class CommentResponseDto {
    private Long id;
    private Long postId;
    private String name;
    private String userEmail;
    private String body;
}
