package com.example.demo.Controller;

import com.example.demo.Models.Category;
import com.example.demo.Models.Product;
import com.example.demo.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products/category")
public class CategoriesController {
    private CategoryService categoryService;
    private CategoriesController(CategoryService categoryService)
    {
        this.categoryService=categoryService;
    }

    @GetMapping()
    public List<String> getAllCategories()
    {
        return categoryService.getAllCategories();
    }


    @GetMapping("{categoryId}")
    public List<Product> getProductsInCategories(@PathVariable("categoryId") String categoryName)
    {
        return categoryService.getProductsInCategories(categoryName);
    }


    @PostMapping()
    public Category addCategory(@RequestBody Category category)
    {
        Category category1=categoryService.addNewCategory(category);
        return category1;
    }
}
