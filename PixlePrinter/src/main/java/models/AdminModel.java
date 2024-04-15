package models;

import java.io.Serializable;

public class AdminModel implements Serializable{
	private String fullName;
	private String email;
	private String userName;
	private String accountType;
	private String password;
	private String phoneNumber;
	
	public AdminModel(String fullName, String email, String userName, String accountType, String password,
			String phoneNumber) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.userName = userName;
		this.accountType = accountType;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}