package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends CrudRepository<Image,Long> {
    Optional<Image> findByImageName(Long imageName);
}
