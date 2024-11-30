package com.example.crudop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
