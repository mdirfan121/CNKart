package com.cn.CNKart.controller;

import com.cn.CNKart.entity.Item;
import com.cn.CNKart.entity.Order;
import com.cn.CNKart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/id/{id}")
    public Order getItemById(@PathVariable int id) {
        return orderService.getOderById(id);
    }

    @PostMapping("/save")
    public void saveItem(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteItem(@PathVariable int id) {
        orderService.deleteOrder(id);
    }
}
