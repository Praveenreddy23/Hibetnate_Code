package com.hibernateApp.firstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_Data {
	public Fetch_Data() {
		// get , load
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		//        get emp eid:1
		//		Emp e = (Emp)session.get(Emp.class, 9);
		//		System.out.println(e);
		//		
		//		Address a = (Address)session.get(Address.class, 9);
		//		System.out.println(a.getArea()+" "+ a.getCity());

		//		load emp :
		Emp e = session.load(Emp.class, 1);
		System.out.println(e.getEsal());

		Address a =session.get(Address.class, 1);
		System.out.println(a.getArea());

		Student s = session.get(Student.class, 1);
		System.out.println(s.getName());

		session.close();
		factory.close();
	}

}
