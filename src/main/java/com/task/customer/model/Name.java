package com.task.customer.model;

import javax.persistence.Entity;


public class Name {
	private String firstName;
	private String middleName;
	private String surName;

	public Name(){

	}

	public Name(String firstName, String middleName, String surName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
}
