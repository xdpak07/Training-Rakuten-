package com.rakuten;

import java.util.HashMap;

public class Appointments {
	private CustomerInformation customer;
	private Integer packageDetails;
	private Trainer trainerPreference;
	private Physiotherapist physioPreference;
	private Integer weeks;
	
	public CustomerInformation getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerInformation customer) {
		this.customer = customer;
	}
	
	public Integer getPackage_details_key() {
		return packageDetails;
	}
	public void setPackage_details_key(Integer package_details_key) {
		this.packageDetails = package_details_key;
	}
	
	public Trainer getTrainerPreference() {
		return trainerPreference;
	}
	public void setTrainer_preference(Trainer trainer_preference) {
		this.trainerPreference = trainer_preference;
	}
	
	public Physiotherapist getPhysioPreference() {
		return physioPreference;
	}
	public void setPhysio_preference(Physiotherapist physio_preference) {
		this.physioPreference = physio_preference;
	}
	
	public Integer getWeeks() {
		return weeks;
	}
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}
	
	public String getpackageDetails() {
		return packageDetails.package_details.get(this.getPackage_details_key());
	}
	
	@Override
	public String toString() {
		return String.format("Customer_Details = \n %s \n Trainer_Preference = %s \n Physio_Preference = %s, Package_Details = %s \n Duration in weeks = %d", 
								this.getCustomer(), 
								this.getTrainerPreference(), 
								this.getPhysioPreference(), 
								this.getpackageDetails(), 
								this.getWeeks());
	}
	
}