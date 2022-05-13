package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;



public class Main {

	public static void main(String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session se=fc.openSession();
		Transaction tx=se.beginTransaction();
		
		Que q=new Que();
		q.setqName("Features of java");
		
		Ans a=new Ans();
		a.setId(1);
		a.setSolution("Multithreaded");
		a.setQu(q);
		
		Ans a1=new Ans();
		a1.setId(2);
		a1.setSolution("Platform Independent");
		a1.setQu(q);
		
		Ans a2=new Ans();
		a2.setId(3);
		a2.setSolution("Object Oriented Language");
		a2.setQu(q);
		
		ArrayList<Ans> list=new ArrayList<Ans>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAn(list);
		
		se.save(q);
		se.save(a);
		se.save(a1);
		se.save(a2);
		
		tx.commit();
		se.close();
		fc.close();
		}
		
		
		
		
		
				
				
		

	}


