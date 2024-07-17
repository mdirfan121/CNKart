package com.cn.CNKart.dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.CNKart.entity.ItemDetail;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDetailsDALImpl implements ItemDetailsDAL {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		ItemDetail itemDetail = session.get(ItemDetail.class, id);
		session.remove(itemDetail);
	}
	
}
