package com.example.springbootajax.repository;

import com.example.springbootajax.model.Clazz;
import com.example.springbootajax.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findAllByNameContaining(Pageable pageable, String name);
    Page<Student> findAllByScoreGreaterThan(Pageable pageable, Double score);
    Iterable<Clazz> findAllByClazzId(Long id);
    Iterable<Student> findAllByScoreBetween(Double from, Double to);
}
