package com.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 Session ses=factory.openSession();
		 Transaction tx=ses.beginTransaction();
		 
		 Employee1 e1=new Employee1(); 
		 e1.setEmp_id(1);
		 e1.setEmpname("Allu Arjun");
		 
		 Employee1 e2=new Employee1();
		 e2.setEmp_id(2);
		 e2.setEmpname("Ram");
		 
		 Project p1=new Project();
		 p1.setP_id(11);
		 p1.setName("Management");
		 
		 Project p2=new Project();
		 p2.setP_id(12);
		 p2.setName("Finance");
		 
		 List<Employee1> list1=new ArrayList<Employee1>();
		 List<Project> list2=new ArrayList<Project>();
		 
		 list1.add(e1);
		 list1.add(e2);
		 list2.add(p1);
		 list2.add(p2);
		 
		 e1.setProject(list2);
		 p2.setEmployee1(list1);
		 
		
		 ses.save(e1);
		 ses.save(e2);
		 ses.save(p1);
		 ses.save(p2);
		 tx.commit();
		 ses.close();
		 factory.close();
		 
		 
		 
		 
		 
		 
		 
		 		
		 		
	}

}
