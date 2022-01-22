package com.kirani.kiranibackendcode.service;


import com.kirani.kiranibackendcode.entity.Orders;
import com.kirani.kiranibackendcode.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private final OrdersRepository ordersRepository;

    public List<Orders> getAllOrders()
    {
        return (List<Orders>) ordersRepository.findAll();
    }

    public void saveOrders(Orders orders)
    {
        this.ordersRepository.save(orders);
    }

    public OrdersService (OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }
}
