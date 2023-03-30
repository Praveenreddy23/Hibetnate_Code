package com.states;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateApp.firstProject.Certificate;
import com.hibernateApp.firstProject.Student;

public class State {

	public static void main(String[] args) {
/** Hibernate States:
    1)Transient state
    2)Persistent state
    3)Detached state
    4)removed state
    
  */
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Creating Student object
		Student s = new Student();
		s.setUsn(10);
		s.setName("Ram");
		s.setMarks(100);
		s.setCity("Bangaluru");
		s.setCerti(new Certificate("Hibernate","4 Months"));
//		Student - > Transient state 
		
		Session ss = f.openSession();
		Transaction t = ss.beginTransaction();
		ss.save(s);
		s.setName("Charan");
//		Student - > Persistent state -> session,database
		t.commit();
	
		ss.close();
//		Student - > Detached state
		s.setName("Da");
		System.out.println(s);
		f.close();
		
	}

}
