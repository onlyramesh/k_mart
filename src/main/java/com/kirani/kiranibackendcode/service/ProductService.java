package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Product;
import com.kirani.kiranibackendcode.entity.ProductUpdate;
import com.kirani.kiranibackendcode.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product>  getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product findById(Long productId){
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        else {
            throw new RuntimeException();
        }
    }

    public void saveProduct(Product product){
//
        this.productRepository.save(product);
    }
    public ProductService(ProductRepository repository){
        this.productRepository = repository;
    }

   // public byte[] getImagefor(Long productId) {
   //     Optional<Product> optionalProduct=this.productRepository.findById(productId);
   //     return optionalProduct.map(Product::getImage).orElse(null);
   // }

    public void updateProduct(Long productId, ProductUpdate productUpdate){
        Product product1 =findById(productId);
        product1.setImageName(productUpdate.getImageName());
        product1.setProductName(productUpdate.getProductName());
        product1.setProductHash(productUpdate.getProductHash());
        product1.setProductMrp(productUpdate.getProductMrp());
        product1.setProductVar(productUpdate.getProductVar());
        product1.setProductQuantity(productUpdate.getProductQuantity());
        product1.setProductSynonyms(productUpdate.getProductSynonyms());
        product1.setProductDiscountPer(productUpdate.getProductDiscountPer());
        productRepository.save(product1);
    }
}
