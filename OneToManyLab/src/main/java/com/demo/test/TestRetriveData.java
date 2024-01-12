package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestRetriveData {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Department D1=session.get(Department.class, 15);
		System.out.println(D1); 
		
		//Employee e1=session.get(Employee.class, 2);
		//System.out.println(e1); 
		
		System.out.println(D1.getEset());
		//System.out.println(D1.getEset());
		

	}

}
