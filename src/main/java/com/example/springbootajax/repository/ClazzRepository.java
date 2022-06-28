package com.example.springbootajax.repository;

import com.example.springbootajax.model.Clazz;
import com.example.springbootajax.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Long> {

}
