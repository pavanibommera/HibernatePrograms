package com.manytomany.join;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session ses=fc.openSession();
		Transaction tx=ses.beginTransaction();
		
		Project1 p1=new Project1();
		p1.setP_Id(1);
		p1.setP_Title("Student Management System");
		
		Project1 p2=new Project1();
		p2.setP_Id(2);
		p2.setP_Title("Smart City");
		
		Employee e1=new Employee();
		e1.setE_Id(11);
		e1.setE_Name("Pavani");
		
		Employee e2=new Employee();
		e2.setE_Id(12);
		e2.setE_Name("Ganesh");
		
		List<Employee>list1=new ArrayList<Employee>();
		List<Project1>list2=new ArrayList<Project1>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProject1(list2);
		p2.setEmployee(list1);
		
		 ses.save(e1);
		 ses.save(e2);
		 ses.save(p1);
		 ses.save(p2);
		 
		 tx.commit();
		 ses.close();
		 fc.close();
		
		
		
		
		
		
		

	}

}
