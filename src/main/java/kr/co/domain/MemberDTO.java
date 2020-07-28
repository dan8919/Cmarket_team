package kr.co.domain;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String id;
private String pw;
private String uname;
private int phone;
private String addr;
private String authority;


public MemberDTO() {
	// TODO Auto-generated constructor stub
}


public MemberDTO(String id, String pw, String uname, int phone, String addr, String authority) {
	super();
	this.id = id;
	this.pw = pw;
	this.uname = uname;
	this.phone = phone;
	this.addr = addr;
	this.authority = authority;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getPw() {
	return pw;
}


public void setPw(String pw) {
	this.pw = pw;
}


public String getUname() {
	return uname;
}


public void setUname(String uname) {
	this.uname = uname;
}


public int getPhone() {
	return phone;
}


public void setPhone(int phone) {
	this.phone = phone;
}


public String getAddr() {
	return addr;
}


public void setAddr(String addr) {
	this.addr = addr;
}


public String getAuthority() {
	return authority;
}


public void setAuthority(String authority) {
	this.authority = authority;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}

	
}
