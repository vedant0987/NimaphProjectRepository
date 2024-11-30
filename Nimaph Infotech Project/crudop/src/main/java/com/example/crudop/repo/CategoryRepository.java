package com.example.crudop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
