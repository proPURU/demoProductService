package com.example.demo.Controller;


import com.example.demo.DTO.ProductDTO;
import com.example.demo.Models.Category;
import com.example.demo.Models.Product;
import com.example.demo.services.CategoryService;
import com.example.demo.services.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {



    private ProductsService productsService;
    CategoryService categoryService;
    public ProductController(ProductsService productsService,CategoryService categoryService) {
        this.productsService = productsService;

        this.categoryService=categoryService;

    }



    Product convertProductDTO_to_Product(ProductDTO productDTO)
    {
        Product product = new Product();
      //  product.setId(productDTO.getId());
        Category cg=new Category();
        cg.setName(productDTO.getCategory());
        cg.setDescription(productDTO.getDescription());
         product.setCategory(cg);
        categoryService.addNewCategory(cg);
        product.setTitle(productDTO.getTitle());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());

        return  product;
    }


    ///////////////// ADD ALL PRODUCT CONTROLLER //////////////////
    @GetMapping()
    public List<Product> GetAllProducts() {
        return productsService.GetAllProducts();
    }



    ///////////////// GET SINGLE  PRODUCT CONTROLLER //////////////////
    @GetMapping("{productId}")
    public Optional<Product> getSingleProduct(@PathVariable("productId") Long productId) {
        Optional<Product> product = productsService.getSingleProduct(productId);
        return product;
    }



    /////////////// ADD NEW PRODUCT CONTROLLER //////////////////
    @PostMapping()
    public Product addNewProduct(@RequestBody ProductDTO productDTO)
    {
        Product productObj= productsService.addNewProduct(productDTO);
        return productObj;
    }



    ///////////////// UPDATE  NEW PRODUCT CONTROLLER //////////////////

    //@PutMapping
    @PatchMapping("{productId}")
    public Product updateProducts(@PathVariable ("productId") Long productId ,@RequestBody ProductDTO productDTO)
    {
        Product product =convertProductDTO_to_Product(productDTO);
        Product productObj= productsService.updateProducts(
                productId,
                product
        );
        return productObj;
    }

    ///////////////// DELETE  PRODUCT CONTROLLER //////////////////
    @DeleteMapping("{productId}")
    public String deleteProducts(@PathVariable ("productId") Long productId) {

        productsService.deleteProducts(productId);
        String statusCode = null;
        return "Deleted product with status code: " + statusCode;
    }


}
