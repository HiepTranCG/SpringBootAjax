package com.example.springbootajax.controller;

import com.example.springbootajax.model.Product;
import com.example.springbootajax.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping
    public ResponseEntity<Iterable<Product>> findAll(Pageable pageable) {
        return new ResponseEntity<>(productService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/order-by-price")
    public ResponseEntity<Iterable<Product>> findAllOrderByPrice() {
        return new ResponseEntity<>(productService.findAllByOrderByPrice(), HttpStatus.OK);
    }

    @GetMapping("/price-between")
    public ResponseEntity<Iterable<Product>> findAllByPriceBetween(@RequestParam int from, @RequestParam int to) {
        return new ResponseEntity<>(productService.findAllByPriceBetween(from, to), HttpStatus.OK);
    }
}
