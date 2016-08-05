package com.yash.rtd.model;

public class Address {
	private int id;
	private int fk_user_id;
	private String street;
	private int fk_city_id;
	private int fk_state_id;
	private String zipcode;
	private int fk_country_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getFk_city_id() {
		return fk_city_id;
	}
	public void setFk_city_id(int fk_city_id) {
		this.fk_city_id = fk_city_id;
	}
	public int getFk_state_id() {
		return fk_state_id;
	}
	public void setFk_state_id(int fk_state_id) {
		this.fk_state_id = fk_state_id;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getFk_country_id() {
		return fk_country_id;
	}
	public void setFk_country_id(int fk_country_id) {
		this.fk_country_id = fk_country_id;
	}
	
	
	
}
