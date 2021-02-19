package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03For5 {
	public static void main(String[] args) throws IOException {
		
//		##### 반복문 #####
		System.out.println("loof");
		System.out.println();
		
		
//		##### for #####
		
		
//		##### 자판기 프로그램 #####
//		-> Test01if_else2Ex.java 참고
//		-> 음료수를 3번 뽑기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 3; i++) {
			
			System.out.println(i+1 + "번 음료의 금액을 투입하세요");
			int money = Integer.parseInt(br.readLine());
			System.out.println("투입금액:"+money+"원");
				  
			int balance = 0;
			String drinkNumber = "";
			if(money >= 1500) {
				System.out.println("음료수(1.콜라500,2.쥬스1000,3.식혜1500)");
				drinkNumber = br.readLine();//1,2,3
			}else if(money >= 1000) {
				System.out.println("음료수(1.콜라500,2.쥬스1000)");
				drinkNumber = br.readLine();//1,2
			}else if(money >= 500) {
				System.out.println("음료수(1.콜라500)");
				drinkNumber = br.readLine();//1
			}else {
				System.out.println("금액이 부족합니다.");
			}
				  
			if(drinkNumber.equals("3")) {
				balance = money - 1500;
				System.out.println("3.식혜를 선택하셨네요~!");
			}else if(drinkNumber.equals("2")) {
				balance = money - 1000;
				System.out.println("2.쥬스를 선택하셨네요~!");
			}else if(drinkNumber.equals("1")) {
				balance = money - 500;
				System.out.println("1.콜라를 선택하셨네요~!");
			}else {
				balance = money - 0;
				System.out.println("선택안했네요~안녕히가세요");
			}
				  
				System.out.println("잔액:"+balance+"원");
				System.out.println();
		 
		}
		
		
	}
}






