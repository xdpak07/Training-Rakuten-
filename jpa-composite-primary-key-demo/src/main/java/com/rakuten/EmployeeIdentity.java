package com.rakuten;

@Embeddable


public class EmployeeIdentity implements Serializable{
	@NotNull
	@Size(max = 20)
	private String employeeId;
	
	NotNull
	@Size(max = 20)
	private String companyId;
	
	public EmployeeIdentity() {
		
	}
	public EmployeeIdentity(String employeeId, String companyId) {
		this.employeeId = employeeId;
		this.companyId =companyId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	@Overrid
	public boolean equals(Object o) {
		if(this == 0) 
			return true;
		
		if(o == null || getClass() != o.getClass())
			return false;
		
		EmployeeIdentity that = (EmployeeIdentity) o;
		
		if(!employeeId.equals(that.employeeId))
			return false;
		
		return companyId.equals(that.companyId);
				
	}
	@Override
	public int hashCode() {
		int result = employeeId.hashCode();
		result = 31*result + companyId.hashCode();
		return result;
	}

}
