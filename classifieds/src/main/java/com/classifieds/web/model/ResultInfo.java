package com.classifieds.web.model;

import com.classifieds.entity.SellerInformation;

public class ResultInfo {

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(int subCategory) {
		this.subCategory = subCategory;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrimaryImage() {
		return primaryImage;
	}

	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSellerType() {
		return sellerType;
	}

	public void setSellerType(int sellerType) {
		this.sellerType = sellerType;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public SellerInformation getSeller() {
		return seller;
	}

	public void setSeller(SellerInformation seller) {
		this.seller = seller;
	}
}
