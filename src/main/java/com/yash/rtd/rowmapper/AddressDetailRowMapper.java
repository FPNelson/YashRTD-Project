package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Address;

public class AddressDetailRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNo) throws SQLException {
		Address address=new Address();
		address.setId(rs.getInt("id"));
		address.setFk_user_id(rs.getInt("fk_user_id"));
		address.setStreet(rs.getString("street"));
		address.setFk_city_id(rs.getInt("fk_city_id"));
		address.setFk_state_id(rs.getInt("fk_state_id"));
		address.setZipcode(rs.getString("zipcode"));
		address.setFk_country_id(rs.getInt("fk_country_id"));
		return address;
	}

}
