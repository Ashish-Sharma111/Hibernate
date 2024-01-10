package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.MyUser;

public class EmployeeTest {

	public static void main(String[] args) {

		/*
		 * Employee e1=new Employee(1,"Ashish",50000); Employee e2=new
		 * Employee(2,"Dhruv",40000);
		 * 
		 * Employee e3 = new Employee(3, "sor", 50000); Employee e4 = new Employee(4,
		 * "Dhru", 40000);
		 */
         Employee e1=new Employee(5,"Sourabh",60000);
         Employee e2=new Employee(6,"Prab",6000);
         
			/*
			 * MyUser u1 = new MyUser(3, "Sourabh"); MyUser u2 = new MyUser(4, "suar");
			 */

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		/*
		 * session.save(e3); session.save(e4);
		 */
		session.save(e1);
		session.save(e2);
		
	/*	session.save(u1); 
		session.save(u2);*/
		 
		tr.commit();
		session.close();
		
		
		/*
		 * // Session sess1=sf.openSession(); // Transaction
		 * tr1=sess1.beginTransaction(); // //by default it is early fetch // Employee
		 * emp1=sess1.get(Employee.class, 14); // //by default it is lazy fetch Employee
		 * emp1=sess1.load(Employee.class, 14); // //Employee
		 * emp1=sess1.load(Employee.class, 14); // System.out.println("before");
		 * System.out.println(emp1.getEname()); // System.out.println("after"); // //
		 * tr1.commit();
		 */		  
		  
		 

	}

}
