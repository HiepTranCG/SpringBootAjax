package com.example.springbootajax.service;

import com.example.springbootajax.model.Clazz;

import java.util.Optional;

public interface IClassService<Clazz> {
    Iterable<Clazz> findAll();
    Optional<Clazz> findById(Long id);
}
