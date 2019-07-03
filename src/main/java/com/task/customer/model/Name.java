package com.task.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Name {
	@Id
    private int name_id;
	private String firstName;
	private String middleName;
	private String surName;
	@OneToOne(mappedBy = "name" )
	private Customer customer;

	public Name(){

	}

	public Name(int name_id, String firstName, String middleName, String surName, Customer customer) {
		this.name_id = name_id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.customer = customer;
	}

	public int getName_id() {
		return name_id;
	}

	public void setName_id(int name_id) {
		this.name_id = name_id;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
