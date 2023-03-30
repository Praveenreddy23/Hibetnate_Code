package com.hibernateApp.firstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedding_Object {

	public Embedding_Object() {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student s1 = new Student();
		s1.setUsn(101);
		s1.setName("Praveen");
		s1.setMarks(95.30);
		s1.setCity("Bangaluru");
		
		Certificate c = new Certificate();
		c.setCourse("Java Full Stack");
		c.setDuration("4 Months");
		s1.setCerti(c);
		
		Student s2 = new Student();
		s2.setUsn(103);
		s2.setName("Reddy");
		s2.setMarks(95.30);
		s2.setCity("Bangaluru");
		
		Certificate c1 = new Certificate();
		c1.setCourse("Java Full Stack");
		c1.setDuration("5 Months");
		s2.setCerti(c1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Object save
		session.save(s1);
		session.save(s2);
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}
	

}
