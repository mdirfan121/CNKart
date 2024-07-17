package com.cn.CNKart.dal;

import com.cn.CNKart.entity.Item;

public interface ItemDAL {
	Item getByID(int id);

	void save(Item item);

	void delete(int id);

	void update(Item updatedItem);

}
