package kr.co.domain;

import java.io.Serializable;
import java.sql.Date;

public class GoodsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String gno;
private int cno;
private String gname;
private int price;

public GoodsVO() {
	// TODO Auto-generated constructor stub
}

public GoodsVO(String gno, int cno, String gname, int price) {
	super();
	this.gno = gno;
	this.cno = cno;
	this.gname = gname;
	this.price = price;
}

public String getGno() {
	return gno;
}

public void setGno(String gno) {
	this.gno = gno;
}

public int getCno() {
	return cno;
}

public void setCno(int cno) {
	this.cno = cno;
}

public String getGname() {
	return gname;
}

public void setGname(String gname) {
	this.gname = gname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((gno == null) ? 0 : gno.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	GoodsVO other = (GoodsVO) obj;
	if (gno == null) {
		if (other.gno != null)
			return false;
	} else if (!gno.equals(other.gno))
		return false;
	return true;
}



}
