package com.ahsan.service;

import java.util.Collection;

import com.ahsan.domain.Employee;

public interface EmployeeServiceInterface {

	public Employee saveEmployee(Employee emp);
	//public Boolean deleteEmployee(Integer empId);
	//public Employee editEmployee(Employee emp);
	//public Employee findEmployee(Integer empId);
	public Collection<Employee> getAllEmployees();
        public Collection<Employee> getEmployeesBySP();
}
