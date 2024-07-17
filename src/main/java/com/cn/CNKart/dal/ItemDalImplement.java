package com.cn.CNKart.dal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.CNKart.entity.Item;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDalImplement implements ItemDAL {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Item getByID(int id) {

		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		return item;
	}

	@Override
	public void save(Item item) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(item);
	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		session.remove(item);
	}

	@Override
	public void update(Item updatedItem) {
		Session session = entityManager.unwrap(Session.class);
		Item currentItem =session.get(Item.class, updatedItem.getId());
		currentItem.setDiscription(updatedItem.getDiscription());
		currentItem.setName(updatedItem.getName());
		session.merge(currentItem);
	}

}
