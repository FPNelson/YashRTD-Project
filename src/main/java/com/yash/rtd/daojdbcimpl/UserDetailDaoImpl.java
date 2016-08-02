package com.yash.rtd.daojdbcimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
/*@author harsh*/
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
		
		
		String sql="select * from users where email='"+userDetail.getEmail()+"' and password='"+userDetail.getPassword()+"'";
		System.out.println("sql:"+sql);
		return jdbcTemplate.query(sql, new ResultSetExtractor<UserDetail>(){
			
			public UserDetail extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				UserDetail user=null;
				if(rs.next()){
					user=new UserDetail();
					user.setFk_role_id(3);
					user.setFirstname(rs.getString("firstname"));
				}
				
				return user;
			}
			
		});

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
