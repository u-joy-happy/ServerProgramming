package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Variable4 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("variable4");
		
//		##### 값을 입력받는 기능 구현 #####
//		-> java.io
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

//		##### 사람의 정보를 다루는 프로그램 #####
//		필요 데이터 : 성, 이름, 나이, 전화번호 
		System.out.println();
		System.out.println("===== 사용자 정보 입력 =====");
		System.out.println("input your name");
		String name = br.readLine();
		System.out.println("input your age");
		
//		##### 숫자데이터 타입으로 캐스팅 #####
		
//		-> 방법 1. 입력받은 나이에 10살을 증가
//		String age = br.readLine();
//		age = Integer.parseInt(age) + 10 + ""; /* +""를 이용하여 숫자를 문자데이터 타입에 저장시킴 */
//		-> 방법 2. 
		int age = Integer.parseInt(br.readLine());
		
		
		System.out.println("input your phone number");
		String phone = br.readLine();
		
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("핸드폰 번호 : " + phone);
		System.out.println("=========================");
		System.out.println();
		
		
	}// end main
	
}// end class
