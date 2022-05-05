package com.rakuten;

public class CustomerInformation {
	
	private String name; 
	private String gender;
	private String email;
	private Integer mobileNumber;
	private Integer age;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getMobile() {
		return mobileNumber;
	}
	public void setMobile(Integer mobile) {
		this.mobileNumber = mobile;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("Name of the Customer = %s" 
								+" \n Gender = %s \n "
								+ "Age = %d \n Phone Number = %s \n"
								+ " mail Id = %s \n "
								+ "Address = %s \n", 
								
								this.getName(), 
								this.getGender(),
								this.getAge(), 
								this.getMobile(), 
								this.getEmail(), 
								this.getAddress());
	}
	
}