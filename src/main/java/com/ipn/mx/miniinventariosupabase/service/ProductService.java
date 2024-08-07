package com.ipn.mx.miniinventariosupabase.service;

import com.ipn.mx.miniinventariosupabase.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Product update(Long id, Product product);
    void deleteById(Long id);
}
