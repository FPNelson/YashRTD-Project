package com.yash.rtd.service;

import java.util.List;

import com.yash.rtd.model.Gender;
import com.yash.rtd.model.UserDetail;

public interface UserDetailService {
	
	/**
	 * this method will insert the user detail in DB.
	 * @param userDetail
	 */
	public void insertUserDetail(UserDetail userDetail);
	/**
	 * This method will authenticate user detail, taken from login form
	 * and compaire with user credential in DB. 
	 * @param userDetail
	 * @return
	 */
	public UserDetail authenticateUser(UserDetail userDetail);
	
	/**
	 * This method will edit the user detail based on id
	 * @param id
	 */
	public void editUserDetail(int id);
	/**
	 * This method will delete the user detail based on id
	 * @param id
	 */
	public void deleteUserDetail(int id);
	
	/**
	 * This method will return all the user detail from db.
	 * @return
	 */
	public List<UserDetail> listUserDetail();
	/**
	 * This method will return one user detail based on id
	 * @param id
	 * @return
	 */
	public UserDetail findUserDetailById(int id);
	/**
	 * This method will return the list of user details based on free text search
	 * @param freeText
	 * @return
	 */
	public List<UserDetail> findUserDetail(String freeText);
	
	/**
	 * This method returns the list of values 
	 * present in Gender table 
	 * @return
	 */
	public List<Gender> listGenderDetails();

}
