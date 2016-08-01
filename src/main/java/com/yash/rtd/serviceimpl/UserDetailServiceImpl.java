package com.yash.rtd.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.service.UserDetailService;
@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDetailDao userDetailDao;
	
	public void setUserDetailDao(UserDetailDao userDetailDao) {
		this.userDetailDao = userDetailDao;
	}
	

	public void insertUserDetail(UserDetail userDetail) {
		// TODO Auto-generated method stub

	}

	public UserDetail authenticateUser(UserDetail userDetail) {
		
		return userDetailDao.authenticateUser(userDetail);
	}

	public void editUserDetail(int id) {
		// TODO Auto-generated method stub

	}

	public void deleteUserDetail(int id) {
		// TODO Auto-generated method stub

	}

	public List<UserDetail> listUserDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDetail findUserDetailById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDetail> findUserDetail(String freeText) {
		// TODO Auto-generated method stub
		return null;
	}

}
