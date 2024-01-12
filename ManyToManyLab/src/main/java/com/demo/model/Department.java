package com.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity(name="Dept08")
public class Department {
	@Id
	private int deptno;
	private String dname;
	private String dloc;
	@ManyToMany(mappedBy="dset")
	private Set<Employee> eset;

	
	public Department() {
		super();
	}
	public Department(int deptno, String dname, String dloc, Set<Employee> eset) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.dloc = dloc;
		this.eset = eset;
	}
	
	
	
	public Department(int deptno, String dname, String dloc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
	
	
	
	

}
