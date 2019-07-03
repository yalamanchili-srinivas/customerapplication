package com.task.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MailingAddress {
	@Id
	private int adderss_id;
	private String houseType;
	private String houseTypeName;
	private String streetName;
	private String suburb;
	private String city;
	private String state;
	private String country;
	private String pincode;

	public MailingAddress() {

	}

	public MailingAddress(int adderss_id, String houseType, String houseTypeName, String streetName, String suburb,
			String city, String state, String country, String pincode) {
		this.adderss_id = adderss_id;
		this.houseType = houseType;
		this.houseTypeName = houseTypeName;
		this.streetName = streetName;
		this.suburb = suburb;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getAdderss_id() {
		return adderss_id;
	}

	public void setAdderss_id(int adderss_id) {
		this.adderss_id = adderss_id;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseTypeName() {
		return houseTypeName;
	}

	public void setHouseTypeName(String houseTypeName) {
		this.houseTypeName = houseTypeName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
