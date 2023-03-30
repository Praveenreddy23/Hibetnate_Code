package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	
	public OneToOne() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
//		Create Object of Question
		Question q = new Question();
		q.setQuestionId(101);
		q.setQuestion("Fav_Actor");
		
//		Create Object of Answer
		Answer a = new Answer();
		a.setAnswerID(201);
		a.setAnswer("Prabhas");
		a.setQ(q);
		q.setAns(a);
		
//		Create Object of Question
		Question q1 = new Question();
		q1.setQuestionId(102);
		q1.setQuestion("Fav_Film");
		
//		Create Object of Answer
		Answer a1 = new Answer();
		a1.setAnswerID(202);
		a1.setAnswer("Chatrapati");
		a1.setQ(q1);
		q1.setAns(a1);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(q);
		session.save(q1);
		session.save(a);
		session.save(a1);
		
		tx.commit();
		
//		Fetching..
//		Question que = session.get(Question.class, 101);
//		System.out.println(que.getQuestion());
//		System.out.println(que.getAns().getAnswer());
		
		
		
		
		session.close();
		factory.close();
	}

}
