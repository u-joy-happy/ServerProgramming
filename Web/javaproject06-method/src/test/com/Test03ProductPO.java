package test.com;

import java.util.Date;

public class Test03ProductPO {
	
	int insert() {
		System.out.println("int insert() --------------");
		return 1;
	}
	
	int update() {
		System.out.println("int update() --------------");
		return 1;
	}
	
	int delete() {
		System.out.println("int delete() --------------");
		return 1;
	}
	
	int insert(Test03ProductVO vo) {
		System.out.println("int insert(Test03ProductVO vo) --------------");
		System.out.println("제품 번호 : " + vo.getpNum());
		System.out.println("제품 이름 : " + vo.getpName());
		System.out.println("제품 가격 : " + vo.getPrice());
		System.out.println("제조일자 : " + vo.getMdate());
		return 1;
	}
	
	int update(Test03ProductVO vo) {
		System.out.println("int update(Test03ProductVO vo) --------------");
		System.out.println("제품 번호 : " + vo.getpNum());
		System.out.println("제품 이름 : " + vo.getpName());
		System.out.println("제품 가격 : " + vo.getPrice());
		System.out.println("제조일자 : " + vo.getMdate());
		return 1;
	}
	
	int delete(Test03ProductVO vo) {
		System.out.println("int delete(Test03ProductVO vo) --------------");
		System.out.println("제품 번호 : " + vo.getpNum());
		System.out.println("제품 이름 : " + vo.getpName());
		System.out.println("제품 가격 : " + vo.getPrice());
		System.out.println("제조일자 : " + vo.getMdate());
		return 1;
	}
	
	Test03ProductVO select() {
		System.out.println("Test03ProductVO select() --------------");
		Test03ProductVO vo = new Test03ProductVO();
//		vo.pNum = 1;
		vo.setpNum(1);
//		vo.pName = "빵";
		vo.setpName("빵");
//		vo.price = 1500;
		vo.setPrice(1500);
//		vo.mdate = new Date();
		vo.setMdate(new Date());
		return vo;
	}
	
	Test03ProductVO[] selectAll() {
		System.out.println("Test03ProductVO[] selectAll() --------------");
		Test03ProductVO[] vos = new Test03ProductVO[3];
		
		for(int i = 0; i < vos.length; i++) {
//			vos[i] = new Test03ProductVO();
			Test03ProductVO vo = new Test03ProductVO();
//			vo.pNum = 100 + i;
			vo.setpNum(100 + i);
//			vo.pName = "음료수" + i;
			vo.setpName("음료수" + i);
//			vo.price = 1000 * (i+1);
			vo.setPrice(1000 * (i+1));
//			vo.mdate = new Date();
			vo.setMdate(new Date());
			vos[i] = vo;
		}
		
//		Test03ProductVO vo1 = new Test03ProductVO();
//		vo1.pNum = 2;
//		vo1.pName = "음료수";
//		vo1.price = 1000;
//		vo1.mdate = new Date();
//		vos[0] = vo1;
//		
//		vo1 = new Test03ProductVO();
//		vo1.pNum = 3;
//		vo1.pName = "과자";
//		vo1.price = 2000;
//		vo1.mdate = new Date();
//		vos[1] = vo1;
//		
//		vo1 = new Test03ProductVO();
//		vo1.pNum = 4;
//		vo1.pName = "떡";
//		vo1.price = 5000;
//		vo1.mdate = new Date();
//		vos[2] = vo1;
		
		return vos;
	}
	
}
