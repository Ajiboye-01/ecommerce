package com.ecommerce.products.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ProductDiscount {
    private int id;
    private boolean isActive;
}
