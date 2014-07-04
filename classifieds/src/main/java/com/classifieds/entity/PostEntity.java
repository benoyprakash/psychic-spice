package com.classifieds.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PostEntity {

	private long id;
	private String title;
	private String desc;
	private int subCategory;
	private String price;
	private String primaryImage;
	private String location;
	private int sellerType;
	
	private int locationId;
	private SellerInformation seller;
	
	@Column(name = "post_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "desc")
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Column(name = "sub_cat_id")
	public int getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(int subCategory) {
		this.subCategory = subCategory;
	}
	
	@Column(name = "price")
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Column(name = "pri_image")
	public String getPrimaryImage() {
		return primaryImage;
	}
	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}
	
	@Column(name = "location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name = "sellerType")
	public int getSellerType() {
		return sellerType;
	}
	public void setSellerType(int sellerType) {
		this.sellerType = sellerType;
	}
	
	@Column(name = "locationId")
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	@ManyToOne
	@JoinColumn(name = "seller_id", referencedColumnName = "seller")
	public SellerInformation getSeller() {
		return seller;
	}
	public void setSeller(SellerInformation seller) {
		this.seller = seller;
	}
}
