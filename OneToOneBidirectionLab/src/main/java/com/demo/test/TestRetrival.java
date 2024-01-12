package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyAddress;
import com.demo.model.MyUser12;


public class TestRetrival {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		MyUser12 u1=session.get(MyUser12.class, 10);
		System.out.println(u1);
		
		MyAddress a1=session.get(MyAddress.class,8);
		System.out.println(a1);

	}

}
