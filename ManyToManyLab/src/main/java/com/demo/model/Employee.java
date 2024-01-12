package com.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.demo.model.Department;



@Entity(name="emp08")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private double sal;
	@ManyToMany
	@JoinTable(name="Emp08_Dept08",joinColumns={@JoinColumn(name="empid")},inverseJoinColumns= {@JoinColumn(name="deptno")})
    Set<Department> dset;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double sal, Set<Department> dset) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.dset = dset;
	}
	
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Set<Department> getDset() {
		return dset;
	}
	public void setDset(Set<Department> dset) {
		this.dset = dset;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dset=" + dset + "]";
	}
	
	
	
	
	
	
}