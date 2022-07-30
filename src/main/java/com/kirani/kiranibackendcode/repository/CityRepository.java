package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
}
