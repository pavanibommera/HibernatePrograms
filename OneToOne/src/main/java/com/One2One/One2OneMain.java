package com.One2One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneMain {
	
	public static void main (String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session s=fc.openSession();
		Transaction tx=s.beginTransaction();
		
		Product p=new Product();
		p.setPid(1);
		p.setPname("Ensure");
		p.setPrice(1000);
		
		Supplier su=new Supplier();
		su.setSid(2000);
		su.setSname("GANESH");
		su.setAddress("ARMOOR");
		su.setPh_No(891949645);
		p.setSid(su);
		
		s.save(p);
		s.save(su);
		
		tx.commit();
		s.close();
		fc.close();
		
		

	
	}

}
