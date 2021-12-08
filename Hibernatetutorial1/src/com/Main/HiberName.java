package com.Main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.UserDetails;
public class HiberName {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails ud=new UserDetails();
		ud.setUserId(1);
		ud.setUserName("Bhavya");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(ud);
		session.getTransaction().commit();
		
		

	}

}
