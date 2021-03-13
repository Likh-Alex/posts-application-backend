package com.dev.postsapp.controller;

import com.dev.postsapp.dto.PostResponseDto;
import com.dev.postsapp.service.ApiService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class PostController {
    private final ApiService apiService;

    @GetMapping
    public ResponseEntity<List<PostResponseDto>> getPosts() {
        return new ResponseEntity<>(apiService.getPosts(), HttpStatus.OK);
    }
}
