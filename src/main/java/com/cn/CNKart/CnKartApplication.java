package com.cn.CNKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cn.CNKart.dal.ItemDAL;

@SpringBootApplication
public class CnKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnKartApplication.class, args);
	}

}
