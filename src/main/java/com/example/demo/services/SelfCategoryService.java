package com.example.demo.services;



import com.example.demo.Models.Category;
import com.example.demo.Models.Product;
import com.example.demo.Repo.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SelfCategoryService implements CategoryService{
    private CategoryRepository categoryRepository;
    public SelfCategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository=categoryRepository;
    }

    @Override
    public List<String> getAllCategories() {
        List<Category> list=categoryRepository.findAll();

        List<String> ans=new ArrayList<String>();
//        for(int i=0;i<list.size();i++)
//        {
//            ans.add(list.get(i).getDescription());
//
//        }

        return ans;

    }


    @Override
    public List<Product> getProductsInCategories(String categoryName) {
        return null;
    }

    @Override
    public Category addNewCategory(Category category) {
        Category category1=categoryRepository.save(category);
        return category1;
    }
}

