package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<Image,Long> {
}
