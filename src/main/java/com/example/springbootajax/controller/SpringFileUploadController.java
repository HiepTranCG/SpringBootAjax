package com.example.springbootajax.controller;

import com.example.springbootajax.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@CrossOrigin("*")
public class SpringFileUploadController {
    @PostMapping("/upload")
    public ResponseEntity<Post> handleFileUpload(@RequestParam("file") MultipartFile []files, Post post) {
        for(MultipartFile file : files) {
            try {
                file.transferTo(new File("E:\\CodeGym\\Java_MD4\\demoajax\\image\\" + file.getOriginalFilename()));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }

        return ResponseEntity.ok(post);
    }
}
