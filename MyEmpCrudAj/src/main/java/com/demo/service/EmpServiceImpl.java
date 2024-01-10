package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService {
 private EmpDao edao;
 
 
 public EmpServiceImpl(){
	 super();
	 
this.edao=new EmpDaoImpl();
	 
 }
 
public List<Employee> findAllEmployees()
{
	 return edao.getAllEmployee();
	 
}
	 
 }
 

