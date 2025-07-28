package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
public class Product extends BaseModel {

    private String title;
    private double price;
    private String description;
    private String imageUrl;

    @ManyToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

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

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}




//package com.example.demo.Models;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class Product extends BaseModel {
//    private  String title;
//    private double price;
//    private String description;
//    private  String imageUrl;
//    @ManyToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.EAGER)
//    @JoinColumn(name = "category_id", referencedColumnName = "id")
//    private Category category;
//
//}
