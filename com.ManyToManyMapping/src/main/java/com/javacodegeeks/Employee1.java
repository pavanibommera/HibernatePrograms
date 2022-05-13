package com.javacodegeeks;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		{
			@NamedQuery(name = "findEmployee1byid",
					query = "from Employee1 emp where emp.id = :id") })

@Entity
@Table(name = "Employee1")
//public class Employee1 implements java.io.Serializable {
public class Employee1 {

	@Id
	public int emp_id;
	public String empName;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee1 [emp_id=" + emp_id + ", empName=" + empName + ", getEmp_id()=" + getEmp_id()
				+ ", getEmpName()=" + getEmpName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
