package com.example.nguyenthanhlam.service;

import com.example.nguyenthanhlam.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();

    ProductEntity createProduct(ProductEntity p);
    void deleteProduct(int id);
    ProductEntity updateProduct(ProductEntity p);

}
