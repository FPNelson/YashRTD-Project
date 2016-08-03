package com.yash.rtd.dao;

import java.util.List;

import com.yash.rtd.model.Location;
import com.yash.rtd.model.UserDetail;

public interface AdminDao {
	
	public void insertLocation(Location location);
	
	public void modifyLocation(Location location);
	
	public void removeLocation(Location location);
	
	public List<Location> searchLocation(Location location);
	
	public List<UserDetail> searchUserDetailsByLocation(Location location);
}
