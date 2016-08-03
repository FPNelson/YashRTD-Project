package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Gender;

public class GenderDetailsRowMapper implements RowMapper<Gender>{

	public Gender mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		Gender gender=new Gender();
		gender.setGender_id(rs.getInt("gender_id"));
		gender.setGender(rs.getString("gender"));
		return gender;
	}
	
}
