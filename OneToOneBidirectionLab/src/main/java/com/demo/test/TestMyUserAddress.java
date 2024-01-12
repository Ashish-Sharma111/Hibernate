package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyAddress;
import com.demo.model.MyUser12;

public class TestMyUserAddress {
	public static void main(String[] args) {
		MyAddress arr=new MyAddress();
		arr.setAddid(7);
		arr.setStreet("wakkad road");
		arr.setCity("pune");
		

		
		
		MyAddress arr1=new MyAddress(8,"Deccan","pune");
		
		MyUser12 u1=new MyUser12();
		u1.setUid(10);
		u1.setUname("ankur");
		u1.setAddr(arr);
		arr.setU(u1);
		
	    MyUser12 u2=new MyUser12(14,"Aman",arr1);
		arr.setU(u1);
		
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
	Session session= sf.openSession();
	
	Transaction tr= session.beginTransaction();
	
	    session.save(arr);	
	    session.save(arr1);	
	    session.save(u1);	
	    session.save(u2);
	    
	    tr.commit();
	    
	    session.close();
	
	
	
	
	
	}
}
