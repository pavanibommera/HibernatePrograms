package com.OneToOne;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Session ses=factory.openSession();
	    Transaction tr=ses.beginTransaction();
	    
	    Que que=new Que();
	    que.setId(5);
	    que.setQ_Name("What is Hibernate");
	    
	    Answer a=new Answer();
	    a.setA_id(101);
	    a.setA_solution("Hibernate is an open source ORM Tool");
	    que.setA_id(a);
	    
	   
	    ses.save(que);
	    ses.save(a);
	    
	    tr.commit();
	    ses.close();
	    factory.close();
	}
	

}
