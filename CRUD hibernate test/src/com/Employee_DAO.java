package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Employee_DAO {
	public static void main(String[] ars) {
		Employee_DAO.insert_data();

	}
	public static void insert_data()
	{
		try {
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			Employee obj_Employee=new Employee();
			obj_Employee.setEmployee_name("employee one");
			obj_Employee.setMobile_no("987");
			session.save(obj_Employee);
			session.close();
			sessionfactory.close();
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
