package com.xworkz.amazon.dto;

public class AmazonDTO {

	private String userName;
	private int age;
	private String email;
	private String contactNumber;
	private String password;
	private String orderPrice;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getOrderNames() {
		return orderPrice;
	}
	public void setOrderNames(String orderNames) {
		this.orderPrice = orderNames;
	}
	
	@Override
	public String toString() {
		return "AmazonDTO [userName=" + userName + ", age=" + age + ", email=" + email + ", contactNumber="
				+ contactNumber + ", password=" + password + ", orderNames=" + orderPrice + "]";
	}
	
	
	
	
}
