package com.dev.postsapp.service;

import com.dev.postsapp.dto.CommentResponseDto;
import com.dev.postsapp.dto.PostResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private static final String COMMENTS_API_ENDPOINT = "https://jsonplaceholder.typicode.com/comments";
    private static final String POSTS_API_ENDPOINT = "https://jsonplaceholder.typicode.com/posts";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<CommentResponseDto> getComments() {
        HttpGet request = new HttpGet(COMMENTS_API_ENDPOINT);
        List<CommentResponseDto> dtoList = new ArrayList<>();
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
                 CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                String inputJson = EntityUtils.toString(responseEntity);
                dtoList.addAll(objectMapper.readValue(inputJson, List.class));
            }
        } catch (IOException e) {
            throw new RuntimeException("Can not fetch `comments` data", e);
        }
        return dtoList;
    }

    public List<PostResponseDto> getPosts() {
        HttpGet request = new HttpGet(POSTS_API_ENDPOINT);
        List<PostResponseDto> dtoList = new ArrayList<>();
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
                 CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                String inputJson = EntityUtils.toString(responseEntity);
                dtoList.addAll(objectMapper.readValue(inputJson, List.class));
            }
        } catch (IOException e) {
            throw new RuntimeException("Can not fetch `postsapp` data", e);
        }
        return dtoList;
    }
}
