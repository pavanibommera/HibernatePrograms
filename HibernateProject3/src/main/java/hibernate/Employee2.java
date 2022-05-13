package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee2")

public class Employee2 {
	
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

	public void setEmpsal(float f) {
		this.empsal = f;
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
	
	


