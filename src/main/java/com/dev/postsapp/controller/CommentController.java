package com.dev.postsapp.controller;

import com.dev.postsapp.dto.CommentResponseDto;
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
@RequestMapping("/comments")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class CommentController {
    private final ApiService commentService;

    @GetMapping
    public ResponseEntity<List<CommentResponseDto>> getComments() {
        return new ResponseEntity<>(commentService.getComments(), HttpStatus.OK);
    }
}
