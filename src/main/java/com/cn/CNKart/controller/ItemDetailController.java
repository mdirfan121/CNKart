package com.cn.CNKart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.CNKart.service.ItemDetailService;

@RestController
@RequestMapping("/details")
public class ItemDetailController {
    
	
	@Autowired
	ItemDetailService itemDetailService;
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable int id) {
		itemDetailService.delete(id);
	}
}
