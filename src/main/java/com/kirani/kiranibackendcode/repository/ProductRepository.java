package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
//    byte[] getImageByProductId(Long Id);
}
