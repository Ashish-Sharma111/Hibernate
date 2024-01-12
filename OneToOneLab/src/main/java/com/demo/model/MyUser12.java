package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Myuser02")
public class MyUser12 {
	
    @Id
	private int uid;
	
	private String uname;
	@OneToOne
	
    @JoinColumn(name="addid")
	private MyAddress addr;

	public MyUser12() {
		super();
	}

	public MyUser12(int uid, String uname, MyAddress addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public MyAddress getAddr() {
		return addr;
	}

	public void setAddr(MyAddress addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MyUser12 [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}
	
	
	

}
