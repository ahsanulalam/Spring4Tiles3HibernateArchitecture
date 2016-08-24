package com.ahsan.daoInterface;

import java.util.Collection;

import com.ahsan.domain.Employee;
import com.ahsan.genericDAO.GenericRepositoryInterface;

public interface EmployeeRepositoryInterface extends GenericRepositoryInterface<Employee>{

	//public Employee saveEmployee(Employee emp);
	//public Boolean deleteEmployee(Employee emp);
	//public Employee editEmployee(Employee emp);
	//public Employee findEmployee(Integer empId);
	public Collection<Employee> getAllEmployees();

    public Collection<Employee> getEmpBySP();

    
}
