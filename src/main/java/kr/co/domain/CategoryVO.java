package kr.co.domain;

import java.io.Serializable;

public class CategoryVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cno;
	private int cname;
	
	
	public CategoryVO() {
		// TODO Auto-generated constructor stub
	}


	public CategoryVO(int cno, int cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}


	public int getCno() {
		return cno;
	}


	public void setCno(int cno) {
		this.cno = cno;
	}


	public int getCname() {
		return cname;
	}


	public void setCname(int cname) {
		this.cname = cname;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
