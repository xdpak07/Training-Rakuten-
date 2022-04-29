package com.rakuten;

import com.rakuten.Employee;
import com.rakuten.EmployeeIdentity;
import org.springframework.stereotype.Repository;

import java.util.List;


// Created by rajeevkumarsingh on 22/11/17.
 

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {
    List<Employee> findByEmployeeIdentityCompanyId(String companyId);
}