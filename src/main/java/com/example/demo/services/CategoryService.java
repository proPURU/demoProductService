package com.example.demo.services;

import com.example.demo.Models.Category;
import com.example.demo.Models.Product;

import java.util.List;

public interface CategoryService {
    List<String> getAllCategories();
    List<Product> getProductsInCategories(String categoryName);
    Category addNewCategory(Category category);

}
