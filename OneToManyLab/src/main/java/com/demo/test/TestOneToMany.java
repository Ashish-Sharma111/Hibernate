package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
     
	Employee e1=new Employee(1,"Dhruv",5000);
	Employee e2=new Employee(2,"Sourabh",5005);
	Employee e3=new Employee(3,"Anshu",5050);
	Employee e4=new Employee(4,"kiran",5500);
	
	Set<Employee>eset1=new HashSet<>();
	eset1.add(e1);
	eset1.add(e2);
	
	Set<Employee>eset2=new HashSet<>();
	eset2.add(e3);
	eset2.add(e4);
	
	Department D1=new Department(15,"HR","pune",eset1);
	Department D2=new Department(16,"Sell","Banglore",eset2);
	
	e1.setDept(D1);
	e2.setDept(D1);
	e3.setDept(D2);
	e4.setDept(D2);
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
	session.save(D1);
	session.save(D2);
	session.save(e1);
	session.save(e2);
	session.save(e3);
	session.save(e4);
	
	tr.commit();
	
	
	
	}

}
