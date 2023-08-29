package com.ecommerce.products.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.products.Model.Product;
import com.ecommerce.products.Service.ProductService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController
public class ProductController {

    @Autowired
    private final ProductService service;

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product products){
        return service.saveProduct(products);
    }

    @GetMapping("/products")
}
