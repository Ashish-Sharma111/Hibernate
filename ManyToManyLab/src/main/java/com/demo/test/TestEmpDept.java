package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestEmpDept {

	public static void main(String[] args) {
     
		
	Employee e1=new Employee(1,"Ashish",5000.00);
	Employee e2=new Employee(2,"Anuj",5500.00);
	Employee e3=new Employee(3,"Arpit",5050.00);
	Employee e4=new Employee(4,"Ashu",5005.00);
	
	Set<Employee> eset1= new HashSet<>();
	eset1.add(e1);
	eset1.add(e2);
	eset1.add(e3);
	
	Set<Employee> eset2= new HashSet<>();
	eset2.add(e1);
	eset2.add(e3);
	eset2.add(e4);
	
	Department D1=new Department(1,"loan","Pune");
	
	Department D2=new Department(2,"Banking","Pune");
	
	D1.setEset(eset1);
	D2.setEset(eset2);
    
	Set<Department> Dset1=new HashSet<>();
    Dset1.add(D1);
	Dset1.add(D2);
	
	Set<Department> Dset2=new HashSet<>();
    Dset2.add(D1);
	
    Set<Department> Dset3=new HashSet<>();
    Dset3.add(D2);
    
    e1.setDset(Dset1);
    e2.setDset(Dset2);
    e3.setDset(Dset3);
    e4.setDset(Dset3);
    
    SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
    session.save(e1);
    session.save(e2);
    session.save(e3);
    session.save(e4);
    session.save(D1);
    session.save(D2);
    
    tr.commit();
    
	
	
	
	
	

	}

}
