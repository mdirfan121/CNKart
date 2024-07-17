package com.cn.CNKart.dal;

import com.cn.CNKart.entity.Item;
import com.cn.CNKart.entity.Order;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

@Repository
public class OrderDALImpl implements OrderDAL{

    @Autowired
    EntityManager entityManager;


    @Override
    public Order getOrderById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Order.class,id);
    }

    @Override
    public void deleteOrder(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.remove(session.get(Order.class, id));
    }

    @Override
    public void save(Order saveOrder) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(saveOrder);
    }
}
