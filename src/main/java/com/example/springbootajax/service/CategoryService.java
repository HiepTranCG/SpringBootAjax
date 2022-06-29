package com.example.springbootajax.service;

import com.example.springbootajax.model.Category;
import com.example.springbootajax.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        pageable = PageRequest.of(0, 10, Sort.by("name"));
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Page<Category> findAllByNameContaining(Pageable pageable, String name) {
        return null;
    }
}
