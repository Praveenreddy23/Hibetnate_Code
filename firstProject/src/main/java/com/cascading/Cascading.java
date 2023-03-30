package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Employee;
import com.mapping.Emp_Account;

public class Cascading {
	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session s = f.openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setFirstName("Praveen");
		emp.setLastName("Reddy");
		
		Emp_Account ea = new Emp_Account(201,"SBI","Saving",emp);
		Emp_Account ea1 = new Emp_Account(204,"Paytm","Current",emp);
		Emp_Account ea2 = new Emp_Account(206,"Kotak","Saving",emp);
		
		List<Emp_Account> list = new ArrayList<Emp_Account>();
		list.add(ea);
		list.add(ea1);
		list.add(ea2);
		
		
		emp.setAccount(list);
		 Transaction tx =s.beginTransaction();
		s.save(emp);
//		s.save(ea);
//		s.save(ea1);
//		s.save(ea2);
		
//		System.out.println(s);
//		After applying cascade Automatically ans. generates.
//		
		
		
		tx.commit();
		s.close();
		f.close();
	}
}
