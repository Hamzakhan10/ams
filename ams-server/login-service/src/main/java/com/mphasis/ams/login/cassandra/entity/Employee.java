package com.mphasis.ams.login.cassandra.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee {

	

	@PrimaryKey
	private int eid;

	private String emailId;

	private String role;	
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private int projectCode;
	
	private String mphManager;
	
	private String location;
	
	private int phoneNumber;

	public Employee() {
	}

	/**
	 * Constructor to add a new employee by Admin.
	 * 
	 * @param eid
	 * @param emailId
	 * @param role
	 * @param projectCode
	 */
	public Employee(int eid, String emailId, String role, String password) {
		this.eid = eid;
		this.emailId = emailId;
		this.role = role;
		this.projectCode = projectCode;
	}
	
	public Employee(int eid, String emailId, String role, String password, String firstName, String lastName,
			int projectCode, String mphManager, String location, int phoneNumber) {
		super();
		this.eid = eid;
		this.emailId = emailId;
		this.role = role;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.projectCode = projectCode;
		this.mphManager = mphManager;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * To create or change passwords by employee.
	 * 
	 * @param eid
	 * @param password
	 */
	public Employee(int eid, String password) {
		this.eid = eid;
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, emailId='%s', role='%s']", this.eid, this.emailId, this.role);
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the projectCode
	 */
	public int getProjectCode() {
		return projectCode;
	}

	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mphManager
	 */
	public String getMphManager() {
		return mphManager;
	}

	/**
	 * @param mphManager the mphManager to set
	 */
	public void setMphManager(String mphManager) {
		this.mphManager = mphManager;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
