package models;

import java.io.Serializable;

public class ContactUsMessageModel implements Serializable{
	private String Name;
	private String ContactNumber;
	private String Email;
	private String Message;
	
	public ContactUsMessageModel(String name, String contactNumber, String email, String message) {
		super();
		Name = name;
		ContactNumber = contactNumber;
		Email = email;
		Message = message;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
}