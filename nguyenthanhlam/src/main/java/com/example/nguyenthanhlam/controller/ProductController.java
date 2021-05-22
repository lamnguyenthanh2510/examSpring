package com.example.nguyenthanhlam.controller;

import com.example.nguyenthanhlam.entity.ProductEntity;
import com.example.nguyenthanhlam.model.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping
    public ResponseEntity getProduct(){
        BaseResponse res = new BaseResponse();
        if (name != null){
            res.data = productService.getProductByName(name);
        }else {
            res.data = productService.getAll();
        }
        res.data = productService.getAll();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.createProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

}
