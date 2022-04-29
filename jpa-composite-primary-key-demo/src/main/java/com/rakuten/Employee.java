#package com.rakuten;

import org.hibernate.annotations;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Table;

@Entity
@Table(name = "employees")
public class Employee{
	
	@EmbeddedId
	private EmployeeIdentity employeeIdentity;
	
	@NotNull
	@Size(max = 60)
	private String name;
	
	@NaturalId
	@NotNull
	@Email
	@Size(max = 60)
	private String email;
	
	
	@Size(max = 15)
	@Column(name = "phone_number", unique = true)
	private String phoneNumber;
	
	public Employee() {
		
	}
    public Employee(EmployeeIdentity employeeIdentity, String name, String email, String phoneNumber) {
    		this.employeeIdentity = employeeIdentity;
    		this.name = name;
    		this.email = email;
    		this.phoneNumber = phoneNumber;
    }
    public EmployeeIdentity getEmployeeIdentity() {
    	return employeeIdentity;
    }
    public void setEmployeeIdentity(EmployeeIdentity employeeIdentity) {
    	this.employeeIdentity = employeeIdentity;
    }
    
    public String getEmail() {
		return email;
	}
    
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
    
}