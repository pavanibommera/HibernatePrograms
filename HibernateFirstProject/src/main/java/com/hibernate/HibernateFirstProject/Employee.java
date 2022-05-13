package com.hibernate.HibernateFirstProject;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="e_id")	
int id;
	@Column(name="e_name")
String name;
	@Column(name="e_city")
String city;
	public int getId() {
      return id;
	}
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
