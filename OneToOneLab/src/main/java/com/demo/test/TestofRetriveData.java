package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser12;



public class TestofRetriveData {

	public static void main(String[] args) {
	  
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		MyUser12 u1=session.get(MyUser12.class,3);
		//MyUser12 u1=session.load(MyUser12.class,3);
		System.out.println("before");
		System.out.println(u1.getUname());
		System.out.println("after name");
		System.out.println(u1.getAddr());
		System.out.println("after");
		
		/*
		 * tr.commit(); session.close();
		 */
		
		
		
	     
		
		

	}

}
