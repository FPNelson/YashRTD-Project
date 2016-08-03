package com.yash.rtd.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.rtd.dao.AdminDao;
import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.Location;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	public void insertLocation(Location location) {
		adminDao.insertLocation(location);
	}

	public void modifyLocation(Location location) {
		// TODO Auto-generated method stub

	}

	public void removeLocation(Location location) {
		// TODO Auto-generated method stub

	}

	public List<Location> searchLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDetail> searchUserDetailsByLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

}
