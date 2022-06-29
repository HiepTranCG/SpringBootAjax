package com.example.springbootajax.repository;

import com.example.springbootajax.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int from, int to);

}
