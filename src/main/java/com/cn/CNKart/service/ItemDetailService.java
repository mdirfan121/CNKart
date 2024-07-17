package com.cn.CNKart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.CNKart.dal.ItemDetailsDAL;

import jakarta.transaction.Transactional;

@Service
public class ItemDetailService {

	
	@Autowired
	ItemDetailsDAL itemDetailsDAL;
	
	@Transactional
	public void delete(int id) {
		itemDetailsDAL.delete(id);
	}
	
}
