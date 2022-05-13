package com.hibernate.namedquery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class AppMain {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();

		Employee e=new Employee();
		e.setEmpid(1);
		e.setEmpname("Pavani");
		e.setEmpcity("Hyderabad");
		
		
		Employee e1=new Employee();
	    e1.setEmpid(2);
		e1.setEmpname("Ayesha");
		e1.setEmpcity("Pune");
		
		List<Employee>list=new ArrayList<Employee>
		list.add(e);
		list.add(e1);
		
		ses.save(e);
		ses.save(e1);
		
		//TypedQuery=ses.getNamedQuery("findEmployeeByName");
		    
		 }
	tx.commit();
	ses.close();
	fc.close();
}

		    


