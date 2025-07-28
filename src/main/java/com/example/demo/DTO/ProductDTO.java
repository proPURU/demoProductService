package com.example.demo.DTO;

import com.example.demo.Models.BaseModel;

public class ProductDTO extends BaseModel {

    private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String title, double price, String description, String image, String category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

//package com.example.demo.DTO;
//
//import com.example.demo.Models.BaseModel;
//import lombok.Getter;


//import lombok.Setter;
//
//
//
//@Getter
//@Setter
//
//public class ProductDTO extends BaseModel {
//    private  Long id;
//    private String title;
//    private double price;
//    private String description;
//    private String image;
//    private String category;
//}