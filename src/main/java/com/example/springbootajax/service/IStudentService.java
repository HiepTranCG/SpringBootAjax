package com.example.springbootajax.service;

import com.example.springbootajax.model.Clazz;
import com.example.springbootajax.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService extends IService<Student> {
    Page<Student> findAllByScoreGreaterThan8(Pageable pageable, Double score);

    Iterable<Clazz> findAllByClazzId(Long id);

    Iterable<Student> findAllScoreBetween(Double from, Double to);
    Page<Student> findAll(Pageable pageable);
}
