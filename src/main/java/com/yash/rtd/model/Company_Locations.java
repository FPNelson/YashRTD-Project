package com.yash.rtd.model;

public class Company_Locations {
	private int id;
	private int fk_city_id;
	private String location_name;
	private String location_zipcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFk_city_id() {
		return fk_city_id;
	}
	public void setFk_city_id(int fk_city_id) {
		this.fk_city_id = fk_city_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getLocation_zipcode() {
		return location_zipcode;
	}
	public void setLocation_zipcode(String location_zipcode) {
		this.location_zipcode = location_zipcode;
	}
	
	
	
	
}
