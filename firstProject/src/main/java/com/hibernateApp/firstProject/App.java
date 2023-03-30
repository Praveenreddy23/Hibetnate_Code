package com.hibernateApp.firstProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	Student st;
	Emp e;
	Address a;

	public App() throws IOException {


		System.out.println("Started");

		/**Configuration is a CLASS Which is present in org.hibernate.cfg package.
	       --> It activates the Hibernate Framework.

	       --> It reads both configuration file and mapping files.*/
		Configuration cfg = new Configuration(); 

		/**It checks weather the config file is syntactically correct or not.*/
		cfg.configure("hibernate.cfg.xml");

		/**SessionFactory is an interface which is present in org.hibernate package
        --> It is used to create Session Object.
        --> It is immutable and thread-safe in nature.
        buildSessionFactory() is the factory helper method.
		 */
		SessionFactory factory = cfg.buildSessionFactory();

		//		creating Student object
		st = new Student();
		st.setUsn(23);
		st.setName("Praveen");
		st.setMarks(90.95);

		System.out.println(st);

		//		Creating Emp Object
		e = new Emp();
		e.setEname(" Praveen");
		e.setEsal(800000);
		e.setX(30);
		System.out.println(e);

		//		Creating an object of Address
		a = new Address();
		a.setArea(" Basavanagudi");
		a.setCity("Bangalore");
		a.setAddDate(new Date());
		a.setOpen(true);
		a.setX(163.23);


		//		Reading image
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("logo.png");

		byte[] data = new byte[fis.available()];
		fis.read(data);
		a.setImage(data);
		System.out.println(a);

		/**Session is an interface which is present in the org.hibernate package.
	      --> Session object is created based upon SessionFactory object
	          i.e, factory.
	      --> It OPENS the Connection/Session with Database software through Hibernate Framework.
	      --> It is light-weight object and it is not thread-safe.*/
		Session session = factory.openSession();

		/**Transaction object is used to give the instruction to the database to make the changes
        that happen because of operations a permanent by using commit() method.*/
		Transaction ts = session.beginTransaction();
		session.save(e);
		session.save(a);
		session.save(st);
		ts.commit();
		session.close();
		factory.close();

	}	
}

