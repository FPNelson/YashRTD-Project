package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Address;
import com.yash.rtd.model.Gender;

public class AddressRowMapper implements RowMapper<Address>{

	public Address mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}
