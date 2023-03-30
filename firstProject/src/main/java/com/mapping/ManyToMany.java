package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	public ManyToMany() {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Students s = new Students();
		Students s1 = new Students();

		s.setSid(1023);
		s.setSname("Ram");

		s1.setSid(3201);
		s1.setSname("Charan");

		Std_Course sc = new Std_Course();
		Std_Course sc1 = new Std_Course();

		sc.setCid(101);	
		sc.setcName("JAVA");
		
		sc1.setCid(201);
		sc1.setcName("Python");
		
		List<Students> student = new ArrayList<Students>();
		List<Std_Course> course = new ArrayList<Std_Course>();
		
		student.add(s);
		student.add(s1);
		
		course.add(sc);
		course.add(sc1);
		
		s1.setCourse(course);
		sc1.setStudents(student);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(s);
		session.save(s1);
		session.save(sc);
		session.save(sc1);

		tx.commit();
		session.close();
		factory.close();

	}

}
