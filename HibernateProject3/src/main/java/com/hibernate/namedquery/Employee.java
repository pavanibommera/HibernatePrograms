package com.hibernate.namedquery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;

@NamedQueries(
		{
			@NamedQuery(
			name = "findEmployeeByName"
			query="from Employee1 e where e.name=:name")
		}
		)
@Entity

public class Employee {
	
	@Id
	@Column(name = "eid")
	private int empid;
	
	@Column(name = "ename")
	private String empname;
	
	@Column(name = "esal")
	private float empsal;
	
	@Column(name = "ecity")
	private String empcity;
	
	@Column(name = "edeg")
	private String empdeg;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getEmpsal() {
		return empsal;
	}

	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public String getEmpdeg() {
		return empdeg;
	}

	public void setEmpdeg(String empdeg) {
		this.empdeg = empdeg;
	}

	
}
