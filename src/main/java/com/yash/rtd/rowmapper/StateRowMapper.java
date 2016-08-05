package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.States;

public class StateRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		States states=new States();
		states.setId(rs.getInt("id"));
		states.setState_name(rs.getString("state_name"));
		states.setFk_country_id(rs.getInt("fk_country_id"));
		return states;
	}

}
