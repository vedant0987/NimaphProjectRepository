package com.example.crudop.service;

import org.springframework.data.domain.Page;

import com.example.crudop.entity.Category;

public interface CategoryService {
    Page<Category> getAllCategories(int page, int size);
    Category createCategory(Category category);
    Category getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
