package test.com;

import java.util.Date;

public class Test02Board  {
	
//	-> 전역변수, 멤버필드, 멤버변수
	int num; //글번호
	String title; //제목
	String content; //내용
	String writer; //작성자
	Date wdate; //작성일자
	
	public Test02Board() {
		num = 1;
		title = "title";
		content = "content";
		writer = "writer";
		wdate = new Date();
	}
	
	public Test02Board(int num, String title, String content, String writer, Date wdate) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.wdate = wdate;
	}
	
}
