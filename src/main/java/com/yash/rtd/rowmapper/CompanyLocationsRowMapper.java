package com.yash.rtd.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.rtd.model.Company_Locations;

public class CompanyLocationsRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		Company_Locations companyLocations=new Company_Locations();
		companyLocations.setId(rs.getInt("id"));
		companyLocations.setFk_city_id(rs.getInt("fk_city_id"));
		companyLocations.setLocation_name(rs.getString("location_name"));
		companyLocations.setLocation_zipcode(rs.getString("location_zipcode"));
		return companyLocations;
	}

}
