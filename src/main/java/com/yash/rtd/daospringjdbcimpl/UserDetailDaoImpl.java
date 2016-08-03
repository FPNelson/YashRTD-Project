package com.yash.rtd.daospringjdbcimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.rowmapper.UserDetailRowMapper;

/**
 * This class will implement the UserDetailDao and 
 * perform the implementation using SpringJDBC Template
 * @author sharma.pankaj
 *
 */
@Repository
public class UserDetailDaoImpl implements UserDetailDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public UserDetailDaoImpl() {
		System.out.println("----------"+jdbcTemplate);
	}
	
	public void insertUserDetail(UserDetail userDetail) {
		// TODO Auto-generated method stub
		
	}

	public UserDetail authenticateUser(UserDetail userDetail) {
		//Get firstname, lastname, username, password roleid from 
		// user table
		String sql="select * from user where email=? and password=?";
		UserDetail loggedInUser=jdbcTemplate.queryForObject(sql, new Object[]{userDetail.getEmail(),
				userDetail.getPassword()}, new UserDetailRowMapper());
		return loggedInUser;
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
