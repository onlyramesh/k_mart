package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Orders;
import com.kirani.kiranibackendcode.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController

@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping
    ResponseEntity<Void> saveOrders(@RequestBody Orders orders){
//        Orders orders= new Orders(orderStatus,orderDate,orderTime,orderBillHash,orderTotal,orderContactName,orderContactNumber,orderAddress,orderCouponApplied,orderCouponDiscount,orderElseProductHash,reason,comment);
        System.out.println("order details "+orders);
        ordersService.saveOrders(orders);
        return ResponseEntity.noContent().build();

    }


    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders()
    {
        return ResponseEntity.ok(ordersService.getAllOrders());
    }

}
