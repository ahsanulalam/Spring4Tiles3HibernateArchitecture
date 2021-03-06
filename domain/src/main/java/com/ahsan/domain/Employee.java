package com.ahsan.domain;
// Generated Jan 11, 2016 12:43:47 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="employee"
    ,schema="dbo"
    ,catalog="dbAhsan"
)
public class Employee  implements java.io.Serializable {


     private int id;
     private String empName;
     private String empDesignation;
     private String empSalary;

    public Employee() {
    }

    public Employee(int id, String empName, String empDesignation, String empSalary) {
       this.id = id;
       this.empName = empName;
       this.empDesignation = empDesignation;
       this.empSalary = empSalary;
    }
   
     @Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="emp_name", nullable=false, length=50)
    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    @Column(name="emp_designation", nullable=false, length=50)
    public String getEmpDesignation() {
        return this.empDesignation;
    }
    
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    
    @Column(name="emp_salary", nullable=false, length=50)
    public String getEmpSalary() {
        return this.empSalary;
    }
    
    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }
}


