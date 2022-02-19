package com.kirani.kiranibackendcode.controller;

import com.kirani.kiranibackendcode.entity.Orders;
import com.kirani.kiranibackendcode.repository.OrdersRepository;
import com.kirani.kiranibackendcode.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Order;
import java.security.PublicKey;
import java.util.List;

@RestController

@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping
    ResponseEntity<Long> saveOrders(@RequestBody Orders orders){
//        Orders orders= new Orders(orderStatus,orderDate,orderTime,orderBillHash,orderTotal,orderContactName,orderContactNumber,orderAddress,orderCouponApplied,orderCouponDiscount,orderElseProductHash,reason,comment);
        System.out.println("order details "+orders);
        Long orderID=this.ordersService.saveOrders(orders);
        return ResponseEntity.ok().body(orderID);

    }


    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders()
    {
        return ResponseEntity.ok(ordersService.getAllOrders());
    }

//    @PutMapping("/{orderID}")
//    public ResponseEntity<Orders> updateOrder(@PathVariable(value = "orderId") Long orderID,@RequestBody Orders orders){
//        ordersService.updateOrders(orders,orderID);
//    }
}
