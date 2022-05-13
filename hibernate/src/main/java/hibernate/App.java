package hibernate;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		
		
		/*Employee item1=new Employee();
		item1.setEmpid(1);
		item1.setEmpname("Pavani");
		item1.setEmpcity("Pune");*/
		
		/*Employee item2=new Employee();
		item2.setEmpid(2);
		item2.setEmpname("Ayesha");
		item2.setEmpcity("Hyderabad");*/
		
		//ses.save(item1);
		//ses.delete(item1);
		//ses.update(item1);
		//ses.merge(item1);
		
		Employee e=(Employee)ses.get(Employee.class, 1);
		e.setEmpname("purvi");
		System.out.println("Updated Successfully");
		ses.getTransaction().commit();
		
		/*Employee e=(Employee)ses.get(Employee.class, 2);
		ses.delete(e);
		System.out.println("Deleted Successfully");
		ses.getTransaction().commit();*/
		
		//tx.commit();
		ses.close();
		factory.close();
		
		
	}
}
		
		
		
		


