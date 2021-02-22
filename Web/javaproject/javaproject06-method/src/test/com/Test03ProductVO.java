package test.com;

import java.util.Date;

public class Test03ProductVO {

	int pNum;
	String pName;
	int price;
	Date mdate;
	
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
	
}
