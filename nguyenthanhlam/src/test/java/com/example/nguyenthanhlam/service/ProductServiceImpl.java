package com.example.nguyenthanhlam.service;

import com.example.nguyenthanhlam.entity.ProductEntity;
import com.example.nguyenthanhlam.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        productRepo.save(p);

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return null;
    }

    public List<ProductEntity> getProductByName(String name){
        List<ProductEntity> list = productRepo.findProductByName(name);
        return productRepo.findProductByName(name);
    }
}
