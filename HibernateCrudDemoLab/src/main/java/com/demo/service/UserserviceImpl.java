package com.demo.service;

import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class UserserviceImpl implements UserService {
	
	private UserDao udao;
	
	public UserserviceImpl() {
		udao=new UserDaoImpl();
	}

	@Override
	public void addnewUser() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id");
		int uid=sc.nextInt();
		System.out.println("enter user name");
		String uname=sc.next();
		System.out.println("enter address id");
		int aid=sc.nextInt();
		System.out.println("enter street");
		String street=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		
		MyUser u=new MyUser(uid,uname, new Address(aid,street,city));
		udao.save(u);
		
		
	}

	@Override
	public void closeMySessionFactory() {
		// TODO Auto-generated method stub
		
	}


}
