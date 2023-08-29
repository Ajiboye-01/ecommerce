package com.ecommerce.products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.products.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
