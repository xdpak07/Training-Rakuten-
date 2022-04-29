package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rakuten.*;
import com.rakuten.EmployeeIdentity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCompositePrimaryKeyDemoApplication implements CommandLinneRunner  {
	
	@Autowired
	private EmployeeRepository emoloyeeRepository; 

	public static void main(String[] args) {
		SpringApplication.run(JpaCompositePrimaryKeyDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		employeeRepository.deleteAllInBatch();
		
		Employee employee = new employee(new EmployeeIdentity("E-123", "D-457"),
				"Rajeev Kumar Singh",
				"rajeev@callicoder.com",
						"+91-9999999999");
		
		employeeRepository.save(employee);
		
		employeeRepository.findById(new EmployeeIdentitity("E-123", "D-457"));
		
		employeeRepository.findByEmployeeIdentityComanyId("D-457");
	}

}
