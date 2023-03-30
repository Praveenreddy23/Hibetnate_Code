package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateApp.firstProject.Student;

public class HQL {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session s = f.openSession();
		
//		HQL Syntax:
		String query = "from Student where city = 'Bangalore' ";
		
		Query createQuery = s.createQuery(query);
		
//		Single - Unique
//		Multiple - list
		List<Student> list = createQuery.list();
		
		for (Student student : list) {
			System.out.println(student.getName()+" "+ student.getCity()+" "+ student.getCerti());
		}
		
		
		f.close();
		s.close();
	}

}
