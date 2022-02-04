package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Product;
import com.kirani.kiranibackendcode.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;


    public byte[] convertFiletoByteStream(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        if (fileName == null || fileName.contains("..")) {
//            return new ResponseEntity<String>("Sorry! Filename contains invalid path sequence " + fileName, HttpStatus.BAD_REQUEST);
            throw new Exception("Invalid File");
        }
        return file.getBytes();
    }

    @PostMapping
    ResponseEntity<Void> savePorduct(@RequestParam String productName, @RequestParam String productQuantity, @RequestParam double productMrp, @RequestParam int productDiscountPer,
                                     @RequestParam String productSynonyms, @RequestParam String productHash, @RequestParam int productVar, @RequestParam MultipartFile file) {
        byte[] imageblob;
        try {
            imageblob = convertFiletoByteStream(file);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        Product product= new Product(productName,productQuantity,productMrp,productDiscountPer,productSynonyms,productHash,productVar,imageblob);
        productService.saveProduct(product);
        return ResponseEntity.noContent().build();
    }

    public ProductController(ProductService service) {
        this.productService = service;
    }

    @GetMapping
     public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping(value = "/{productId}/image", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getProductImage(@PathVariable Long productId){
       byte[] image= productService.getImagefor(productId);
       return ResponseEntity.ok(image);
    }

}
