package com.classifieds.web.model;

public class HomeNeedsLeftMenuInfo {
	// Model Object used for collecting the user inputs for refining
	// Home Needs category

	private int category;
	private int[] subCategory;
	private int childCategory;

	// product status : new / old / both
	int productStatus;

	// seller type : individual / business
	private int sellerType;

	int location;

	private boolean buy;

	// Price Range
	private float priceMin;
	private float priceMax;

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int[] getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(int[] subCategory) {
		this.subCategory = subCategory;
	}

	public int getChildCategory() {
		return childCategory;
	}

	public void setChildCategory(int childCategory) {
		this.childCategory = childCategory;
	}

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public int getSellerType() {
		return sellerType;
	}

	public void setSellerType(int sellerType) {
		this.sellerType = sellerType;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public boolean getBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public float getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(float priceMin) {
		this.priceMin = priceMin;
	}

	public float getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(float priceMax) {
		this.priceMax = priceMax;
	}

}
