package com.kirani.kiranibackendcode.service;

import com.kirani.kiranibackendcode.entity.Product;
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

    public void saveProduct(Product product){
//
        this.productRepository.save(product);
    }
    public ProductService(ProductRepository repository){
        this.productRepository = repository;
    }

//    public byte[] getImagefor(Long productId) {
//        Optional<Product> optionalProduct=this.productRepository.findById(productId);
//        return optionalProduct.map(Product::getImage).orElse(null);
//    }
}
