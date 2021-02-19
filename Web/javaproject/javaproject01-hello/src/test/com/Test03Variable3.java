package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Variable3 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("variable3");
		
//		##### 값을 입력받는 기능 구현 #####
//		-> java.io
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
//		##### 게시판 글쓰기 프로그램 #####
		System.out.println();
		System.out.println("===== 게시판 =====");
		System.out.println("제목을 입력하세요");
		String title = br.readLine();
		System.out.println("내용을 입력하세요");
		String content = br.readLine();
		System.out.println("작성자를 입력하세요");
		String writer = br.readLine();
		
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("작성자 : " + writer);
		System.out.println("=================");
		
		
	}// end main
	
}// end class
