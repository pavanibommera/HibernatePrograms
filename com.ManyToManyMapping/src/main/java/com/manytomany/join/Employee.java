package com.manytomany.join;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Employee {
	@Id
	@Column(name="e_Id")
	private int e_Id;
	@Column(name="e_Name")
	private String e_Name;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinTable(name="Employee_Project1",joinColumns= {
    @JoinColumn(name="e_Id")},inverseJoinColumns = {
    @JoinColumn(name="p_Id")})

    private List<Project1> project;

	public int getE_Id() {
		return e_Id;
	}

	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	public String getE_Name() {
		return e_Name;
	}

	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}

	public List<Project1> getProject1() {
		return project;
	}

	public void setProject1(List<Project1> project1) {
		this.project = project1;
	}
    
	}
	
	


