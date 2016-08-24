package com.ahsan.serviceImpl;

import java.util.Collection;

//import javax.transaction.Transactional; //java 7 or higher

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahsan.domain.Employee;
import com.ahsan.daoInterface.EmployeeRepositoryInterface;
import com.ahsan.service.EmployeeServiceInterface;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class EmployeeServiceImplementation implements EmployeeServiceInterface{

	@Autowired
	protected EmployeeRepositoryInterface employeeRepositoryInterface;

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.save(emp);
	}

	/*@Override
	public Boolean deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		Employee temp = employeeRepositoryInterface.findEmployee(empId);
		if(temp!=null){
			return employeeRepositoryInterface.deleteEmployee(temp);
		}
		return false;
	}

	@Override
	public Employee editEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.editEmployee(emp);
	}
*/
	@Override
	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.getAllEmployees();
	}
        
        @Override
	public Collection<Employee> getEmployeesBySP()
        {
        return employeeRepositoryInterface.getEmpBySP();
        }

/*	@Override
	public Employee findEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findEmployee(empId);
	}
*/	

}
