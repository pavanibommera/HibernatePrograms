package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Ans {
	@Id
	private int id;
	private String solution;
	
	@ManyToOne
	private Que qu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Que getQu() {
		return qu;
	}

	public void setQu(Que qu) {
		this.qu = qu;
	}
	
	
	

}
