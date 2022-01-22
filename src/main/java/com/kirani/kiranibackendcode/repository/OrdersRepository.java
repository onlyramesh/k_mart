package com.kirani.kiranibackendcode.repository;


import com.kirani.kiranibackendcode.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {


}
