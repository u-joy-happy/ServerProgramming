package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01if_else2 {

	public static void main(String[] args) throws IOException {
		
//		##### 음료수 자판기 프로그램 #####
//		-> 필요 데이터 : 투입 금액, 음료수, 잔돈, 선택 제품
//		-> if 와 연산자를 조합하여 완성하세요
		
		int money;
		int balance = 0;
		int drinkNum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("돈을 넣어주세요");
		System.out.println("콜라 : 500원");
		System.out.println("주스 : 1000원");
		System.out.println("식혜 : 1500원");
		money = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.println("투입 된 금액 : " + money);
		System.out.println();
		System.out.println("=========================");
		
		
		if(money >= 1500) {
			System.out.println("선택 가능 한 음료");
			System.out.println("콜라 : 1");
			System.out.println("주스 : 2");
			System.out.println("식혜 : 3");

			System.out.println("원하는 음료의 번호를 입력해 주세요");
//			drinkNum = Integer.parseInt(br.readLine());

		}else if(money >= 1000) {
			System.out.println("선택 가능 한 음료");
			System.out.println("콜라 : 1");
			System.out.println("주스 : 2");

			
			System.out.println("원하는 음료의 번호를 입력해 주세요");
//			drinkNum = Integer.parseInt(br.readLine());
			
		}else if(money >= 500) {
			System.out.println("선택 가능 한 음료");
			System.out.println("콜라 : 1");

			
			System.out.println("원하는 음료의 번호를 입력해 주세요");
//			drinkNum = Integer.parseInt(br.readLine());
			
		}else {
			System.out.println("돈이 부족합니다.");
		}
		System.out.println();
		
		drinkNum = Integer.parseInt(br.readLine());
		
		if(drinkNum == 1) {
			System.out.println("콜라를 선택했습니다");
			
			System.out.println();
			System.out.println("======================");
			System.out.println("음료 나오는 중 데구루루루루");
			System.out.println("======================");
			System.out.println();
			
			balance = money - 500;
			System.out.println("콜라와 잔돈 " + balance + "원을 받아가세요");
			
		}else if(money >= 1000 && drinkNum == 2) {
			System.out.println("주스를 선택했습니다");
			
			System.out.println();
			System.out.println("======================");
			System.out.println("음료 나오는 중 데구루루루루");
			System.out.println("======================");
			System.out.println();
			
			balance = money - 1000;
			System.out.println("주스와 잔돈 " + balance + "원을 받아가세요");
			
		}else if(money >= 1500 && drinkNum == 3) {
			System.out.println("식혜를 선택했습니다");
			
			System.out.println();
			System.out.println("======================");
			System.out.println("음료 나오는 중 데구루루루루");
			System.out.println("======================");
			System.out.println();
			
			balance = money - 1500;
			System.out.println("식혜와 잔돈 " + balance + "원을 받아가세요");
			
//		}else if(drinkNum == 0){
			
		}else {
			System.out.println("잘못 선택하셨습니다");
			System.out.println("투입한 " + money + "원을 다시 받아가세요");
			
		}// end if

		
	}// end main
	
}// end class
