package OneToManyMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		SessionFactory fc=new Configuration().configure().buildSessionFactory();
		Session ses=fc.openSession();
		ses.beginTransaction();
		
		Trainer t=new Trainer();
		t.setT_Name("Aadhya");
		t.setT_Subject("Core Java");
		
		Learner l=new Learner();
		l.setL_Id(1);
		l.setL_Name("Krithi");
		l.setL_Course("JFS");
		l.setTrainer(t);
		
		Learner l1=new Learner();
		l1.setL_Id(2);
		l1.setL_Name("Arha");
		l1.setL_Course("Python");
		l1.setTrainer(t);
		
		Learner l2=new Learner();
		l2.setL_Id(3);
		l2.setL_Name("Sam");
		l2.setL_Course("JFS");
		l2.setTrainer(t);
		
		ses.save(t);
		ses.save(l);
		ses.save(l1);
		ses.save(l2);
		
		Query query = ses.createQuery("from Learner");
		List<Learner>list1=query.list();
		for(Learner lear:list1)
		{
			System.out.println("lear Id:"+lear.getL_Id()+"lear Name:"+lear.getL_Name()+"lear course:");
			
		}
		
		Query query1 = ses.createQuery("select count(*) from Learner");
		 Iterator count = query1.iterate();
		  System.out.println("No.of rows : "+count.next());
		  
	    Query query2 = ses.createQuery("select count(l_name) from Learner where l_course='Python'");
		 Iterator count1 = query2.iterate();
		  System.out.println("No.of rows : "+count1.next());
		  
	    Query query3 = ses.createQuery("select distinct count(distinct l_course) from Learner");
		 Iterator count2 = query3.iterate();
		  System.out.println("No.of rows : "+count2.next());
		  
		Query query4 = ses.createQuery("select min(l_Id) from Learner");
		 Iterator count3 = query4.iterate();
		  System.out.println("Minimum id : "+count3.next());
		  
		Query query5 = ses.createQuery("select max(l_Id) from Learner");
		 Iterator count4 = query5.iterate();
		  System.out.println("Maximum id : "+count4.next());
		  
		Query query6 = ses.createQuery("select sum(l_Id) from Learner");
		 Iterator count5 = query6.iterate();
		  System.out.println("sum of id : "+count5.next());
		  
		Query query7 = ses.createQuery("select avg(l_Id) from Learner");
		 Iterator count6 = query1.iterate();
		  System.out.println("Avg  id : "+count6.next());
		
		ses.getTransaction().commit();
		ses.close();
		fc.close();
	}

	

}
