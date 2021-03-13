package com.dev.postsapp.dto;

import lombok.Data;

@Data
public class PostResponseDto {
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
