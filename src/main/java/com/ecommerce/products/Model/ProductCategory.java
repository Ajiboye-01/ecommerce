package com.ecommerce.products.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ProductCategory {
    private int id;
    private String categoryName;
}
