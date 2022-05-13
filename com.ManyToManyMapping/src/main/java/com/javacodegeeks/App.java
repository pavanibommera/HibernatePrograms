package com.javacodegeeks;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ManyToManyMapping.Employee1;

public class App {

	public static void main(String[] args) {
		SessionFactory fc = new Configuration().configure().buildSessionFactory();
		Session ses = fc.openSession();
		Transaction tx = ses.beginTransaction();

		 /*Employee1 e1=new Employee1(); 
		 e1.setEmp_id(1);
		 e1.setEmpname("Allu Arjun");
		 
		 Employee1 e2=new Employee1();
		 e2.setEmp_id(2);
		 e2.setEmpname("Ram");
		 
		 ses.save(e1);
		 ses.save(e2);*/

		Query query = ses.getNamedQuery("findEmployee1byid");
		query.setInteger("ID", 2);
        List<Employee1> list = query.list();
		for (int i = 0; i<list.size(); i++) {
			System.out.println("Name:" + list.get(i).getEmpname());
		}
		System.out.println(">>>>>>>>>>>>>>" + list.size());
		if (!list.isEmpty()) {
		Employee1 e=(Employee1) list.get(0);
		System.out.println(e);
			
		}
		tx.commit();
		ses.close();
		fc.close();
}
}
