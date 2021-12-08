package com.bhavya.tutorial.hib.Main;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhavya.tutorial.hib.Main.UserDetails;

public class HiberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails ud=new UserDetails();
		ud.setUserID(1);
		ud.setUserName("Bhavya");
		Configuration con= new Configuration().configure().addAnnotatedClass(UserDetails.class);
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(ud);
		tx.commit();

	}

}
