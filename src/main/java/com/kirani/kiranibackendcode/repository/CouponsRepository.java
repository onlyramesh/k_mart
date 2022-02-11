package com.kirani.kiranibackendcode.repository;

import com.kirani.kiranibackendcode.entity.Coupons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponsRepository extends CrudRepository<Coupons,Long> {
}
