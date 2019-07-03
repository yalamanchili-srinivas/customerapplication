package com.task.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
//	private Name name;
	private String title;
	//private MailingAddress mailingAddress;
	private String sex;
	private String maritalStatus;
	private int creditRating;
	private String isNabCustomer;
	public Customer(){

	}

	public Customer(int id,  String title,  String sex, String maritalStatus,
			int creditRating, String isNabCustomer) {
		this.id = id;
		//this.name = name;
		this.title = title;
		//this.mailingAddress = mailingAddress;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.creditRating = creditRating;
		this.isNabCustomer = isNabCustomer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

	public String getIsNabCustomer() {
		return isNabCustomer;
	}

	public void setIsNabCustomer(String isNabCustomer) {
		this.isNabCustomer = isNabCustomer;
	}
}
