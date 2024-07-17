package com.cn.CNKart.dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.CNKart.entity.ItemReview;

import jakarta.persistence.EntityManager;

@Repository
public class ItemReviewDALImpl implements ItemReviewDAL {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void save(ItemReview review) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(review);
	}

}
