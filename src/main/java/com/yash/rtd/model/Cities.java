package com.yash.rtd.model;

public class Cities {
	private int id;
	private String city_name;
	private int fk_state_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public int getFk_state_id() {
		return fk_state_id;
	}
	public void setFk_state_id(int fk_state_id) {
		this.fk_state_id = fk_state_id;
	}
	
	
}
