package com.demo.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.MyUser;


public class UserDaoImpl implements UserDao {
	
	static SessionFactory sf;
	
	static {
		sf=HibernateUtil.getMySessionFactory();
	}

	@Override
	public void save(MyUser u) {
	Session session = sf.openSession();
	Transaction tr= session.beginTransaction();
	session.save(u);
	tr.commit();
	session.close();
	
		
	}

}
