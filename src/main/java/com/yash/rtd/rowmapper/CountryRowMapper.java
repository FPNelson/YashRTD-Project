package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Countries;

public class CountryRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		Countries countries=new Countries();
		countries.setId(rs.getInt("id"));
		countries.setCountry_name(rs.getString("country_name"));
		return countries;
	}

}
