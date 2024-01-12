package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.model.MyAddress;

import com.demo.model.MyUser12;

public class TestMyUserAddress {
	public static void main(String[] args) {
		MyAddress addr=new MyAddress(1,"baner","pune");
		MyAddress addr1=new MyAddress(2,"Deccan","pune");
		MyUser12 u1=new MyUser12(3,"Don",addr);
		MyUser12 u2=new MyUser12(4,"ChotaDon",addr1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(addr);
		sess.save(addr1);
		sess.save(u1);
		sess.save(u2);
		
		tr.commit();
		
		
	}
}
