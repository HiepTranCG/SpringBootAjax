package com.example.springbootajax.controller;

import com.example.springbootajax.model.Student;
import com.example.springbootajax.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<Iterable<Student>> findAll(Pageable pageable) {
        return new ResponseEntity<>(studentService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
