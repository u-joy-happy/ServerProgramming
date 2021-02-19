package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01if_else2Ex {

	public static void main(String[] args) throws IOException {
		
//		##### 음료수 자판기 프로그램 #####
//		-> 필요 데이터 : 투입 금액, 음료수, 잔돈, 선택 제품
//		-> if 와 연산자를 조합하여 완성하세요
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  
		System.out.println("금액을 투입하세요");
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
	 
	
			
	}// end main
	
}// end class
