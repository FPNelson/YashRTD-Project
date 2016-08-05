package com.yash.rtd.model;

public class States {
	private int id;
	private String state_name;
	private int fk_country_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public int getFk_country_id() {
		return fk_country_id;
	}
	public void setFk_country_id(int fk_country_id) {
		this.fk_country_id = fk_country_id;
	}
	
	
	
}
