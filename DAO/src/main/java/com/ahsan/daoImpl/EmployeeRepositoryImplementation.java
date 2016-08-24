package com.ahsan.daoImpl;

import com.ahsan.daoInterface.EmployeeRepositoryInterface;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ahsan.domain.Employee;
import com.ahsan.genericDAO.GenericRepositoryInterfaceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceUnit;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class EmployeeRepositoryImplementation extends GenericRepositoryInterfaceImpl<Employee> implements EmployeeRepositoryInterface{
        
       // @PersistenceContext
      //  @Autowired
	//protected EntityManager entityManager;

	public EmployeeRepositoryImplementation() {
		// TODO Auto-generated constructor stub
                super(Employee.class);
	}

	/*public EntityManager getEntityManager() {
		return entityManager;
	}

	//@PersistenceUnit(unitName="spring-jpa")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}*/

	/*@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		entityManager.persist(emp);
		entityManager.flush();
		return emp;
	}

	@Override
	public Boolean deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
		     entityManager.remove(emp);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	@Override
	public Employee editEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try{
		   return entityManager.merge(emp);
		} catch(Exception ex) {
			return null;
		}
	}*/

	@Override
	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
	    TypedQuery<Employee> query;
            query = entityManager.createQuery("select e from Employee e", Employee.class);
	    return query.getResultList();
	}
        @Override
        public Collection<Employee> getEmpBySP(){
            List<Employee> query = new ArrayList<>();

            Employee queryEmp = new Employee();
            StoredProcedureQuery storeProccedure = entityManager.createStoredProcedureQuery("empById");
            storeProccedure.registerStoredProcedureParameter("v_fieldName1Vc", Integer.class, ParameterMode.IN);
            storeProccedure.registerStoredProcedureParameter("name", String.class, ParameterMode.OUT);
            storeProccedure.registerStoredProcedureParameter("designation", String.class, ParameterMode.OUT);
            storeProccedure.registerStoredProcedureParameter("salary", String.class, ParameterMode.OUT);
            
            storeProccedure.setParameter("v_fieldName1Vc", 1);
            storeProccedure.execute();
            
            queryEmp.setEmpName(storeProccedure.getOutputParameterValue("name").toString());
            queryEmp.setEmpDesignation(storeProccedure.getOutputParameterValue("designation").toString());
            queryEmp.setEmpSalary(storeProccedure.getOutputParameterValue("salary").toString());
            query.add(queryEmp);
            
            return query;
        
        }

	/*@Override
	public Employee findEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return entityManager.find(Employee.class, empId);
	}*/

	
}

