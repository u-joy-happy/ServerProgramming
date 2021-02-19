package test.com;

import java.util.Date;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("board main");
		System.out.println();
		
//		##### 게시판 객체 #####
//		-> 필요 데이터 : 글 번호, 제목, 내용, 작성자, 작성일자
//		-> Test02Board.java
		
//		-> 방법 1. 기본 생성자(Test02Board.java)에 값을 지정
		Test02Board board = new Test02Board();
		System.out.println("values(default) ------------");
		System.out.println(board.num);
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.writer);
		System.out.println(board.wdate);
		System.out.println();
		
//		-> 방법 2. 객체 속성에 접근하여 값을 지정
		board.num = 2;
		board.title = "즐거운 자바시간";
		board.content = "점심 먹어서 졸리다";
		board.writer = "효주";
		board.wdate = new Date();
		System.out.println("values(속성 접근 가능 경우) ------------");
		System.out.println(board.num);
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.writer);
		System.out.println(board.wdate);
		System.out.println();
		
		Test02Board board2 = new Test02Board(3, "오늘은 금요일", "어끝집 (어차피 끝나고 집가야 됨)", 
				"불쌍한 효주", new Date());
		System.out.println("values(생성자를 통한 값 설정) ------------");
		System.out.println(board2.num);
		System.out.println(board2.title);
		System.out.println(board2.content);
		System.out.println(board2.writer);
		System.out.println(board2.wdate);
		
		
		
	}
	
}
