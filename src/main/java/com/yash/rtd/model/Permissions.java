package com.yash.rtd.model;

public class Permissions {
	private int permission_id;
	private int fk_role_id;
	private String permission_type;
	
	public int getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(int permission_id) {
		this.permission_id = permission_id;
	}
	public int getFk_role_id() {
		return fk_role_id;
	}
	public void setFk_role_id(int fk_role_id) {
		this.fk_role_id = fk_role_id;
	}
	public String getPermission_type() {
		return permission_type;
	}
	public void setPermission_type(String permission_type) {
		this.permission_type = permission_type;
	}
}	
