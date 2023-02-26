package com.example.btvnw1.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@NamedQuery(name = "findAll",query = "SELECT p FROM Product AS p")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(columnDefinition = "double default 7000000")
    private Double price;
    @Column
    private String desc;
    @Column
    private String imagePath;
    @Transient
    private MultipartFile image;

    public Product(Long id, String name, Double price, String desc, String imagePath, MultipartFile image) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.imagePath = imagePath;
        this.image = image;
    }

    public Product(String name, Double price, String desc, String imagePath, MultipartFile image) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.imagePath = imagePath;
        this.image = image;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
