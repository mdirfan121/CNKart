package com.cn.CNKart.service;

import com.cn.CNKart.dal.ItemDAL;
import com.cn.CNKart.dal.OrderDAL;
import com.cn.CNKart.entity.Item;
import com.cn.CNKart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDAL orderDAL;

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Order getOderById(int id) {
        return orderDAL.getOrderById(id);
    }

    @Transactional
    public void saveOrder(Order order) {

        Order saveOrder = new Order();
        saveOrder.setOrderType(order.getOrderType());
        List<Item> itemList = new ArrayList<>();
        for(Item item: order.getItems()){
            Item currentItem = itemDAL.getByID(item.getId());
            itemList.add(currentItem);
        }
        saveOrder.setItems(itemList);
        orderDAL.save(saveOrder);
    }

    @Transactional
    public void deleteOrder(int id) {
        orderDAL.deleteOrder(id);
    }
}
