package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.UserDetail;

public class UserDetailRowMapper implements RowMapper<UserDetail> {

	public UserDetail mapRow(ResultSet rs, int rowNo) throws SQLException {
		UserDetail userDetail=new UserDetail();
		userDetail.setId(rs.getInt("id"));
		userDetail.setFirstname(rs.getString("firstname"));
		userDetail.setLastname(rs.getString("lastname"));
		userDetail.setEmail(rs.getString("email"));
		userDetail.setContact(rs.getString("contact"));
		userDetail.setDob(rs.getDate("dob"));
		userDetail.setUsername(rs.getString("username"));
		userDetail.setPassword(rs.getString("password"));
		userDetail.setFk_role_id(rs.getInt("fk_role_id"));
		return userDetail;
	}

}
