package com.classifieds.web.model;

import java.util.Map;

public class PostInfo {
	// Model Object for creating a new post

	private String category;
	private String subCategory;
	private String childCategory;
	
	private String adTitle;
	// condition : new or used
	private boolean condition;
	private String price;

	// Address
	private String locality;
	private Map<Integer, String> allLocalities;
	private String city;
	private Map<Integer, String> allCities;

	// Seller Information
	private boolean sellerType;
	private String name;
	private String landPhone;
	private String mobilePhone;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getChildCategory() {
		return childCategory;
	}
	public void setChildCategory(String childCategory) {
		this.childCategory = childCategory;
	}
	public String getAdTitle() {
		return adTitle;
	}
	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}
	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public Map<Integer, String> getAllLocalities() {
		return allLocalities;
	}
	public void setAllLocalities(Map<Integer, String> allLocalities) {
		this.allLocalities = allLocalities;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Map<Integer, String> getAllCities() {
		return allCities;
	}
	public void setAllCities(Map<Integer, String> allCities) {
		this.allCities = allCities;
	}
	public boolean isSellerType() {
		return sellerType;
	}
	public void setSellerType(boolean sellerType) {
		this.sellerType = sellerType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLandPhone() {
		return landPhone;
	}
	public void setLandPhone(String landPhone) {
		this.landPhone = landPhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
