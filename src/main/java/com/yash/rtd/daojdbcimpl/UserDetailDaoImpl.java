package com.yash.rtd.daojdbcimpl;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.UserDetailDao;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.rowmapper.UserDetailRowMapper;

@Repository
public class UserDetailDaoImpl implements UserDetailDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertUserDetail(UserDetail userDetail) {
		String sql="insert into users(firstname,lastname,email,contact,dob,password,fk_gender_id,"
				+ "fk_role_id,fk_status_id,image,doj,fk_company_location_id,"
				+ "created_date,last_modified_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Date date=new Date();
		java.sql.Timestamp timeStamp=new java.sql.Timestamp(date.getTime());
		
		try{
			jdbcTemplate.update(sql, new Object[]{userDetail.getFirstname(),userDetail.getLastname()
					,userDetail.getEmail(),userDetail.getContact(),userDetail.getDob(),
					userDetail.getPassword(),1,3,
					1,userDetail.getImage(),userDetail.getDoj(),
					1,timeStamp,timeStamp});
		}
		catch(Exception ex){
			throw new RuntimeException(ex);
		}
		
	}

	public UserDetail authenticateUser(UserDetail userDetail) {		
		
		String sql="select * from users where email=? and password=?";
		UserDetail uDetail = (UserDetail)jdbcTemplate.queryForObject(sql, new Object[]{userDetail.getEmail(),userDetail.getPassword()}, new UserDetailRowMapper());
		return uDetail;

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
