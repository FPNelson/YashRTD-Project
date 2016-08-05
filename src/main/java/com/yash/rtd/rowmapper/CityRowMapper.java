package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Cities;

public class CityRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		Cities cities=new Cities();
		cities.setId(rs.getInt("id"));
		cities.setCity_name(rs.getString("city_name"));
		cities.setFk_state_id(rs.getInt("fk_state_id"));
		return cities;
	}

}
