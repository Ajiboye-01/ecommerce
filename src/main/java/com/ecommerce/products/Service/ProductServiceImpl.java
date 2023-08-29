package com.ecommerce.products.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.products.Model.Product;
import com.ecommerce.products.Repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product saveProduct(Product products) {
        return productRepo.save(products);
    }

}
