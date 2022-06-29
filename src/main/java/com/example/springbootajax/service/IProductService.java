package com.example.springbootajax.service;

import com.example.springbootajax.model.Product;

public interface IProductService extends IService<Product>{
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int from, int to);

}
