package com.yash.rtd.daojdbcimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.yash.rtd.dao.AdminDao;
import com.yash.rtd.model.Location;
import com.yash.rtd.model.UserDetail;
import com.yash.rtd.rowmapper.UserDetailRowMapper;
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertLocation(Location location) {
		String sql = "select cities.id "
				+ "from cities cities "
				+ "INNER JOIN states states ON states.id = cities.fk_state_id "
				+ "INNER JOIN countries countries ON countries.id = states.fk_country_id "
				+ "where cities.city_name=? and states.state_name=? and countries.country_name=?";
		int city_id = jdbcTemplate.queryForInt(sql,
				new Object[] { location.getCity_name(), location.getState_name(),
						location.getCountry_name() });

		sql = "insert into company_locations(fk_city_id,location_name,location_zipcode) "
				+ "values(?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { city_id, location.getLocation_name(),
						location.getLocation_zipcode() });
	}

	public void modifyLocation(Location location) {
		// TODO Auto-generated method stub

	}

	public void removeLocation(Location location) {
		// TODO Auto-generated method stub

	}

	public List<Location> searchLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDetail> searchUserDetailsByLocation(String location) {
		
		//String sql = "SELECT * FROM users AS u JOIN company_locations AS c ON u.fk_company_location_id = c.id  WHERE c.`location_zipcode` = ? OR c.`location_name`= ?";
		String sql = "SELECT * FROM users u JOIN company_locations cl ON u.`fk_company_location_id`=cl.id JOIN cities ct ON cl.`fk_city_id`=ct.`id` JOIN states st ON ct.`fk_state_id`=st.`id` JOIN countries c ON st.`fk_country_id`=c.`ID` where c.`COUNTRY_NAME` LIKE ? OR cl.location_zipcode LIKE ? OR cl.location_name LIKE ? OR st.state_name LIKE ? or ct.city_name LIKE ?";
		List<UserDetail> userDetailList= jdbcTemplate.query(sql, new Object[]{location,location,location,location,location}, new UserDetailRowMapper());
		return userDetailList;
	}

}
