package com.kirani.kiranibackendcode.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;


    private String productName;
    private String productQuantity;
    private double productMrp;
    private int productDiscountPer;
    private String productSynonyms;
    private String productHash;
    private int productVar;

    @Lob
    @JsonIgnore
    private byte[] image;

    public Product(){}

    public Product(String productName, String productQuantity, double productMrp, int productDiscountPer, String productSynonyms, String productHash, int productVar, byte[] image) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productMrp = productMrp;
        this.productDiscountPer = productDiscountPer;
        this.productSynonyms = productSynonyms;
        this.productHash = productHash;
        this.productVar = productVar;
        this.image = image;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductMrp() {
        return productMrp;
    }

    public void setProductMrp(double productMrp) {
        this.productMrp = productMrp;
    }

    public int getProductDiscountPer() {
        return productDiscountPer;
    }

    public void setProductDiscountPer(int productDiscountPer) {
        this.productDiscountPer = productDiscountPer;
    }

    public String getProductSynonyms() {
        return productSynonyms;
    }

    public void setProductSynonyms(String productSynonyms) {
        this.productSynonyms = productSynonyms;
    }

    public String getProductHash() {
        return productHash;
    }

    public void setProductHash(String productHash) {
        this.productHash = productHash;
    }

    public int getProductVar() {
        return productVar;
    }

    public void setProductVar(int productVar) {
        this.productVar = productVar;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
