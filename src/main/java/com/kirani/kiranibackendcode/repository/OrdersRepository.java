package com.kirani.kiranibackendcode.repository;


import com.kirani.kiranibackendcode.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {


//    static Optional<Orders> findById(Long id);
}
