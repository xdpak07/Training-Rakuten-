package com.rakuten;

public class Appointment {
	
	
		private Customer customer;
		private Integer package_detail;
		private Integer weeks;
		private Trainer trainer;
		private Physiotherapist physio;
		
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Integer getPackage_detail() {
			return package_detail;
		}
		public void setPackage_detail(Integer package_detail) {
			this.package_detail = package_detail;
		}
		public Integer getWeeks() {
			return weeks;
		}
		public void setWeeks(Integer weeks) {
			this.weeks = weeks;
		}
		public Trainer getTrainer() {
			return trainer;
		}
		public void setTrainer(Trainer trainer) {
			this.trainer = trainer;
		}
		public Physiotherapist getPhysio() {
			return physio;
		}
		public void setPhysio(Physiotherapist physio) {
			this.physio = physio;
		}
		
	}
}
