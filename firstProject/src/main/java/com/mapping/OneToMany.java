package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
//         ManyToOne
	public OneToMany() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee e = new Employee();
		e.setEmpId(23);
		e.setFirstName("Praveen");
		e.setLastName("Reddy");
		
		
		Emp_Account ea = new Emp_Account();
	    ea.setAcc_Id(101);
	    ea.setName("SBI");
	    ea.setAcc_type("Saving");
	    ea.setEmp(e);
	    
	    Emp_Account ea1 = new Emp_Account();
	    ea1.setAcc_Id(102);
	    ea1.setName("Paytm");
	    ea1.setAcc_type("Saving");
	    ea1.setEmp(e);
	    
	    Emp_Account ea2 = new Emp_Account();
	    ea2.setAcc_Id(103);
	    ea2.setName("Kotak");
	    ea2.setAcc_type("Current");
	    ea2.setEmp(e);
	    
	    Emp_Account ea3 = new Emp_Account();
	    ea3.setAcc_Id(104);
	    ea3.setName("HDFC");
	    ea3.setAcc_type("Current");
	    ea3.setEmp(e);
	    
	    List<Emp_Account> account = new ArrayList<Emp_Account>();
	    account.add(ea);
	    account.add(ea1);
	    account.add(ea2);
	    account.add(ea3);
	    
	    e.setAccount(account);
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(e);
		session.save(ea);
		session.save(ea1);
		session.save(ea2);
		session.save(ea3);
		
		tx.commit();
//		Fetching..
//		Employee emp = session.get(Employee.class, 23);
//		System.out.println(emp.getAccount());
//		
//		for (Emp_Account emp_Account : account) {
//			System.out.println(emp_Account.getName());
//	}
		Employee emp = session.get(Employee.class, 23);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getAccount().size());
//		 
		session.close();
		factory.close();
		
	}
	

}
