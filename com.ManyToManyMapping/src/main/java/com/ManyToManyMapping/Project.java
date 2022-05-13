package com.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Project {
	
	@Id
	private int p_id;
	private String pname;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee1>employee1;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return getName();
	}

	public void setName(String name) {
		this.pname = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee1> getEmployee1() {
		return employee1;
	}

	public void setEmployee1(List<Employee1> employee1) {
		this.employee1 = employee1;
	}

	
		
	

	
	}

	
	

	
	
	
	
	


