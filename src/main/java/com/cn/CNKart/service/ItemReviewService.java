package com.cn.CNKart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.CNKart.dal.ItemReviewDAL;
import com.cn.CNKart.entity.ItemReview;

@Service
public class ItemReviewService {

	
	@Autowired
	ItemReviewDAL itemReviewDAL;
	
	
	public void save(ItemReview review) {
		itemReviewDAL.save(review);
	}

}
