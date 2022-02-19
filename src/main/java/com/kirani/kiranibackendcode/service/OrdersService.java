package com.kirani.kiranibackendcode.service;


import com.kirani.kiranibackendcode.entity.Orders;
import com.kirani.kiranibackendcode.repository.OrdersRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ClientInfoStatus;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private final OrdersRepository ordersRepository;

    public List<Orders> getAllOrders()
    {
        return (List<Orders>) ordersRepository.findAll();
    }

    public Long saveOrders(Orders orders)
    {
        Orders newOrders=this.ordersRepository.save(orders);
//        this.ordersRepository.save(orders);
        return newOrders.getOrderID();
    }



    public OrdersService (OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

}
