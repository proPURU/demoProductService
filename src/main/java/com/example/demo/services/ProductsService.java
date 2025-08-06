package com.example.demo.services;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsService {
    List<Product> GetAllProducts();

    public List<Product> GetAllProductsByPagination(int a,int b);

    Product addNewProduct(
            ProductDTO product
    );
    Optional<Product> getSingleProduct(Long productId);
    Product updateProducts( Long productId,Product product);
    String deleteProducts(Long productId);

}
