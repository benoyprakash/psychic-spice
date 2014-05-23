package com.classifieds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Test {

	@Column
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
