package com.cn.CNKart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.CNKart.dal.ItemDAL;
import com.cn.CNKart.entity.Item;
import com.cn.CNKart.entity.ItemReview;

import jakarta.transaction.Transactional;

@Service
public class ItemService {

	@Autowired
	ItemDAL itemDAL;
	
	@Transactional
	public Item getItemById(int id) {
		return itemDAL.getByID(id);
	}

	@Transactional
	public void saveItem(Item item) {
		itemDAL.save(item);
	}

	@Transactional
	public void deleteItem(int id) {
		itemDAL.delete(id);
	}

	@Transactional
	public void updateItem(Item updatedItem) {
		itemDAL.update(updatedItem);
	}

}
