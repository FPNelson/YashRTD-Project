package com.yash.rtd.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * User Model will be used to hold the data from form. 
 * and perform form validation
 * @author sharma.pankaj
 *
 */
public class UserDetail {
	/**
	 * id of user
	 */
	private int id;
	/**
	 * user's firstname
	 */
	private String firstname;
	/**
	 * user's last name
	 */
	private String lastname;
	/**
	 * user's email
	 */
	private String email;
	/**
	 * user's contact
	 */
	private String contact;
	/**
	 * user's dob
	 */
	private Date dob;
	/**
	 * user's username
	 */
	private String username;
	/**
	 * user's password
	 */
	private String password;
	/**
	 * user's gender
	 */
	private String gender;
	/**
	 * user's role---linked with role table
	 */
	private int fk_role_id; // fk from role table
	/**
	 * user's status---linked with status table
	 */
	private int fk_status_id;// fk from status table
	/**
	 * user's date of joining
	 */
	private Date doj;
	/**
	 * id of user, who created this user
	 * In case if admin creates the user, in that case admin id will be hold
	 * if manager creates the user in that case manager id will be hold. 
	 */
	private int created_by;
	/**
	 * id of user, who modified the record of user
	 */
	private int last_modified_by;
	/**
	 * this will hold for the date on which user is registered
	 * may be by himself or by some other user (like, manager or admin)
	 */
	private Timestamp created_date;
	/**
	 * If user is modified, then modified date must be stored in system automatically
	 */
	private Timestamp last_modified_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFk_role_id() {
		return fk_role_id;
	}
	public void setFk_role_id(int fk_role_id) {
		this.fk_role_id = fk_role_id;
	}
	public int getFk_status_id() {
		return fk_status_id;
	}
	public void setFk_status_id(int fk_status_id) {
		this.fk_status_id = fk_status_id;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(int last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Timestamp getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Timestamp last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
}
