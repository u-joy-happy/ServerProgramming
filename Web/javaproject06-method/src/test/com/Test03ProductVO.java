package test.com;

import java.util.Date;

public class Test03ProductVO {

	private int pNum;
	private String pName;
	private int price;
	private Date mdate;
	
	public Test03ProductVO() {
		pNum = 1;
		pName = "notebook 001";
		price = 1000000;
		mdate = new Date();
	}
	
	
	public Test03ProductVO(int pNum) {
		this();
		this.pNum = pNum;
	}


	public Test03ProductVO(int pNum, String pName, int price, Date mdate) {
		this.pNum = pNum;
		this.pName = pName;
		this.price = price;
		this.mdate = mdate;
	}


	public int getpNum() {
		return pNum;
	}


	public void setpNum(int pNum) {
		this.pNum = pNum;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Date getMdate() {
		return mdate;
	}


	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
	
	
	
}
