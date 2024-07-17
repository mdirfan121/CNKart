package com.cn.CNKart.dal;
import com.cn.CNKart.entity.Order;

public interface OrderDAL {

    Order getOrderById(int id);

    void deleteOrder(int id);

    void save(Order saveOrder);
}
