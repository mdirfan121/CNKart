package com.cn.CNKart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cn.CNKart.entity.ItemReview;
import com.cn.CNKart.service.ItemReviewService;

@RestController
public class ItemReviewController {

	@Autowired
	ItemReviewService itemReviewService;
	
	@PostMapping("/save")
	public void save(@RequestBody ItemReview review) {
		itemReviewService.save(review);
	}
}
