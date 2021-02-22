package test.com;

import java.util.Date;

public class Test02Main {
	
	public static void main(String[] args) {
		System.out.println("board");
		System.out.println();
		Test02Board b = new Test02Board();
		
		b.insert("안녕하세요", "오늘도 자바 수업 중 입니다.", "kim");
		System.out.println();
		
		b.insert(new String[] {"안녕하세요2", "지금은 점심시간 직전 입니다.", "kim"});
		System.out.println();
		
		b.insert2("안녕하세요3", "오늘은 월요일 입니다.", "kim", 100+"");
		System.out.println();
		
		b.insert(100, "안녕하세요", "오늘도 자바 수업 중 입니다.", "kim");
		System.out.println();
		
		Test02BoardVO bvo = new Test02BoardVO();
		bvo.num = 100;
		bvo.title = "안녕하세요";
		bvo.content = "객체와 메서드";
		bvo.writer = "김효주";
		bvo.date = new Date();
		b.insert(bvo);
		System.out.println();
		
		int x = b.insert2();
		System.out.println("insert2() return value : " + x);
		System.out.println();
		
		int[] xx = b.insert3(); // int[] xx = new int[5];
		for(int a : xx) {
			System.out.println(a);
		}
		
		System.out.println();
		
		Test02BoardVO vo2 = b.select();
		System.out.println("num : " + vo2.num);
		System.out.println("title : " + vo2.title);
		System.out.println("content : " + vo2.content);
		System.out.println("writer : " + vo2.writer);
		System.out.println("date : " + vo2.date);
		System.out.println();
		
		vo2.num = 123;
		vo2.title = "하이하이";
		vo2.content = "점심시간 입니당~!";
		vo2.writer = "효주";
		vo2.date = new Date();
		
		Test02BoardVO vo3 = b.select(vo2);
		System.out.println("num : " + vo3.num);
		System.out.println("title : " + vo3.title);
		System.out.println("content : " + vo3.content);
		System.out.println("writer : " + vo3.writer);
		System.out.println("date : " + vo3.date);
		System.out.println();
		
		Test02BoardVO[] vos = b.selectAll();
		for(Test02BoardVO voss : vos) {
			System.out.println("num : " + voss.num);
			System.out.println("title : " + voss.title);
			System.out.println("content : " + voss.content);
			System.out.println("writer : " + voss.writer);
			System.out.println("date : " + voss.date);
			System.out.println("----------------------------------------");
		} // end for
		System.out.println();
		
		Test02BoardVO[] vos2 = b.selectAll("java","method");
		for(Test02BoardVO voss : vos2) {
			System.out.println("num : " + voss.num);
			System.out.println("title : " + voss.title);
			System.out.println("content : " + voss.content);
			System.out.println("writer : " + voss.writer);
			System.out.println("date : " + voss.date);
			System.out.println("----------------------------------------");
		} // end for
		System.out.println();
		
	} // end main
	
} // end class
