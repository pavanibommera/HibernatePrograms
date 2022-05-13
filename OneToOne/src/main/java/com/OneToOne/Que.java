package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity

public class Que {
	
	@Id
	private int id;
	private String Q_Name;
	
	@OneToOne
	@JoinColumn(name="A_id")
	private Answer A_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQ_Name() {
		return Q_Name;
	}

	public void setQ_Name(String q_Name) {
		Q_Name = q_Name;
	}

	public Answer getA_id() {
		return A_id;
	}

	public void setA_id(Answer a_id) {
		A_id = a_id;
	}

	
		
	}

	
		
	

	
			