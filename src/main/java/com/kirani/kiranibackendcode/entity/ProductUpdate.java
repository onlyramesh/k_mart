package com.kirani.kiranibackendcode.entity;

public class ProductUpdate {

    private String productName;

    private String productQuantity;
    private double productMrp;
    private int productDiscountPer;
    private String productSynonyms;
    private String productHash;
    private int productVar;
    private int imageName;

    public ProductUpdate(){

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

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }
}
