package com.cn.CNKart.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String discription;
	
	@OneToOne(cascade = CascadeType.ALL)
	ItemDetail itemDetail;

	@ManyToMany(mappedBy = "items")
	@JsonIgnore
	List<Order> orders;

	@OneToMany(mappedBy="item", cascade = CascadeType.ALL)
	@JsonManagedReference
	List<ItemReview> itemReview;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public List<ItemReview> getItemReview() {
		return itemReview;
	}

	public void setItemReview(List<ItemReview> itemReview) {
		this.itemReview = itemReview;
	}
	
	
	
}
