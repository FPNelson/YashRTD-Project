package com.yash.rtd.model;

public class Address {
	private int address_id;
	private int fk_user_id;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String fk_country_id;
	private Country country;
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getFk_user_id() {
		return fk_user_id;
	}
	public void setFk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getFk_country_id() {
		return fk_country_id;
	}
	public void setFk_country_id(String fk_country_id) {
		this.fk_country_id = fk_country_id;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
}
