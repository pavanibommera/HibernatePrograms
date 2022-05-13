package hibernate;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		Employee2 item1=new Employee2();
		item1.setEmpid(1);
		item1.setEmpname("Pavani");
		item1.setEmpsal(10000.07f);
		item1.setEmpcity("Hyderabad");
		item1.setEmpdeg("Software Engineer");
		
		Employee2 item2=new Employee2();
		item2.setEmpid(2);
		item2.setEmpname("Ayesha");
		item2.setEmpsal(15000.07f);
		item2.setEmpcity("Pune");
		item2.setEmpdeg("Team Leader");
		
		Employee2 item3=new Employee2();
		item3.setEmpid(3);
		item3.setEmpname("Preethi");
		item3.setEmpsal(22000.07f);
		item3.setEmpcity("Mumbai");
		item3.setEmpdeg("Junior Engineer");
		
		Employee2 item4=new Employee2();
		item4.setEmpid(4);
		item4.setEmpname("Ashwini");
		item4.setEmpsal(16000.07f);
		item4.setEmpcity("Delhi");
		item4.setEmpdeg("TeamLeader");
		
		Employee2 item5=new Employee2();
		item5.setEmpid(5);
		item5.setEmpname("Sanvi");
		item5.setEmpsal(20000.07f);
		item5.setEmpcity("America");
		item5.setEmpdeg("Software Engineer");
		
		ses.save(item1);
		ses.save(item2);
		ses.save(item3);
		ses.save(item4);
		ses.save(item5);
		
		Query query=ses.createQuery("from Employee");
		List<Employee2> list=query.list();
		for(Employee2 e:list) {
			System.out.println("Emp Id:"+e.getEmpid()+" ,Emp Name:"+e.getEmpname()+" ,Emp salary:"+e.getEmpsal()+" ,Emp Deg:"+e.getEmpDesignation()+" ,Emp City:"+e.getEmpcity()+" ");
		}
		query=ses.createQuery("update Employee set e_name=:name where id=:id");
		query.setParameter("name", "Karuna");
		query.setParameter("id", 3);
		int result=query.executeUpdate();
		System.out.println("update record:"+result);
		
		query=ses.createQuery("delete Employee where id=:id");
		query.setParameter("id", 4);
		int res=query.executeUpdate();
		System.out.println("delete record:"+res);
		
		query=ses.createQuery("select count(*) from Employee");
		Iterator i=query.iterate();
		System.out.println("Number of rows:"+i.next());
		
		query=ses.createQuery("select max(salary) from Employee");
		i=query.iterate();
		System.out.println("Maximum salary:"+i.next());
		
		query=ses.createQuery("from Employee where salary between 10000 and 20000");
		List<Employee2> list1=query.list();
		for(Employee2 e1:list1) {
		System.out.println("Emp Name:"+e1.getEmpname()+" ");
	}
		query=ses.createQuery("from Employee order by e_name asc");
		List<Employee2> list2=query.list();
		for(Employee2 e2:list2) {
		System.out.println("Emp Id:"+e2.getEmpid()+" ,Emp Name:"+e2.getEmpname()+" ,Emp salary:"+e2.getEmpsal()+" ,Emp Deg:"+ e2.getEmpdeg()+" ,Emp City:"+e2.getEmpcity());
		
		tx.commit();
		ses.close();
		factory.close();

}
	}
}
