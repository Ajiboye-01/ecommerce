package com.ecommerce.products.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Product {
    
    private Long id;
    private String name;
    private String desc;
    private ProductCategory categoryId;
    private ProductDiscount inventoryId;
    private double price;
}
