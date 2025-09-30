package com.JuniorSousa.webServices.repositories;

import com.JuniorSousa.webServices.entities.Category;
import com.JuniorSousa.webServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
