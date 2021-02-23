package test.com;

import java.util.Date;

public class Test03ProductMain {
	
	public static void main(String[] args) {
		System.out.println("product main");
		System.out.println();
		
//		##### VO : Test03ProductVO.java #####
//		-> 필요 데이터 : 제품 번호, 제품 이름, 제품 가격, 제조일자
		
//		##### PO : Test03ProductPO.java #####
//		-> 필요 기능 : 입력, 수정, 삭제, 검색 기능
		
		Test03ProductVO v = new Test03ProductVO();
		Test03ProductPO p = new Test03ProductPO();
		
		
		int ist = p.insert();
		System.out.println("결과 : " + ((ist == 1)? "1.완료" : "0.실패"));
		System.out.println();
		
		int dlt = p.delete();
		System.out.println("결과 : " + ((dlt == 1)? "1.완료" : "0.실패"));
		System.out.println();
		
		int udt = p.update();
		System.out.println("결과 : " + ((udt == 1)? "1.완료" : "0.실패"));
		System.out.println();
		
		System.out.println("=============================");
		System.out.println();
		
		v = new Test03ProductVO(123, "ipad", 10000, new Date());
		
		int ist2 = p.insert(v);
		System.out.println("결과 ------- " + ((ist2 == 1)? "1.완료" : "0.실패"));
		System.out.println();

		v = new Test03ProductVO(345, "airpods", 20000, new Date());
		
		int dlt2 = p.delete(v);
		System.out.println("결과 ------- " + ((dlt2 == 1)? "1.완료" : "0.실패"));
		System.out.println();
		
		v = new Test03ProductVO(567, "iphone", 30000, new Date());
		
		int udt2 = p.update(v);
		System.out.println("결과 ------- " + ((udt2 == 1)? "1.완료" : "0.실패"));
		System.out.println();
		
		System.out.println("=============================");
		System.out.println();
		
		
		Test03ProductVO vo = p.select();
		System.out.println("select 결과 ");
		System.out.println("제품 번호 : " + vo.getpNum());
		System.out.println("제품 이름 : " + vo.getpName());
		System.out.println("제품 가격 : " + vo.getPrice());
		System.out.println("제조일자 : " + vo.getMdate());
		System.out.println();
		
		Test03ProductVO[] vos = p.selectAll();
		System.out.println("selectAll 결과 ");
		for(Test03ProductVO voss : vos) {
			System.out.print("제품번호:" + voss.getpNum() + "  ");
			System.out.print("제품이름:" + voss.getpName() + "  ");
			System.out.print("제품가격:" + voss.getPrice() + "  ");
			System.out.println("제조일자:" + voss.getMdate());
		}
		System.out.println();
		
		
	} // end main
	
} // end class