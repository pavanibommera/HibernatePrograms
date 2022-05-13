package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee {
	
	@Id
	@Column(name = "eid")
	private int empid;
	
	@Column(name = "ename")
	private String empname;
	
	@Column(name = "ecity")
	private String empcity;

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

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public Employee(int empid, String empname, String empcity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empcity=" + empcity + "]";
	}
	

	
	}


