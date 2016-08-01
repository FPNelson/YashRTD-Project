package com.yash.rtd.daojdbcimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
@Repository
public class UserDetailDaoImpl implements UserDetailDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	public void insertUserDetail(UserDetail userDetail) {
		// TODO Auto-generated method stub

	}

	public UserDetail authenticateUser(UserDetail userDetail) {
		
			
		return null;
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
