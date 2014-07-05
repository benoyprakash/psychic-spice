package com.classifieds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller_information")
public class SellerInformation {

	private long sellerInfoId;
	private boolean sellerType;
	private String name;
	private String landPhone;
	private String mobilePhone;
	private String eMailId;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	public long getSellerInfoId() {
		return sellerInfoId;
	}

	public void setSellerInfoId(long sellerInfoId) {
		this.sellerInfoId = sellerInfoId;
	}

	@Column(name = "seller_type")
	public boolean isSellerType() {
		return sellerType;
	}

	public void setSellerType(boolean sellerType) {
		this.sellerType = sellerType;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "land_phone_no")
	public String getLandPhone() {
		return landPhone;
	}

	public void setLandPhone(String landPhone) {
		this.landPhone = landPhone;
	}

	@Column(name = "mobile_no")
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "email")
	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
	

}
