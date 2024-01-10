package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao {
	
	static Connection conn;
	static PreparedStatement selemp;
	
	static {
		conn=DBUtil.getMyConnection();
		try {
			selemp=conn.prepareStatement("select * from Employee");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Employee>getAllEmployee(){
		List<Employee> lst=new ArrayList<>();
			
		try {
			//rs to store output
			ResultSet rs=selemp.executeQuery();
			while(rs.next()) {
				Employee e= new  Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				
				lst.add(e);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lst;
		
	}

}
