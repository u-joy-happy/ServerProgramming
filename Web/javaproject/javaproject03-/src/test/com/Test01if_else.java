package test.com;

public class Test01if_else {

	public static void main(String[] args) {
		System.out.println("decision");
//		-> if, else, else if, switch, case, break
		
		
//		##### 분기문 : if #####
		System.out.println("========== if ==========");
		
		int a = 35%10;
		if (a == 5) {
			System.out.println("aaa");
			System.out.println("aaa");
			System.out.println("aaa");
		}// end if
		System.out.println();
		
		
//		##### 분기문 : if~else #####
		System.out.println("========== if ~ else ==========");
		
		if (a == 5) {
			System.out.println("bbb");
			System.out.println("bbb");
		}else {
			System.out.println("ccc");
			System.out.println("ccc");
		}// end if
		System.out.println();
		
		
//		##### 분기문 : if~else if #####
		System.out.println("========== if ~ else if ==========");
		System.out.println("예제 1.");
		int score = 90;
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}// end if
		System.out.println();
		
		System.out.println("예제 2.");
		int menu = 1;
		if (menu == 1) {
			System.out.println("콜라를 선택하셨군요!");
		}else if (menu == 2) {
			System.out.println("주스를 선택하셨군요!");
		}else if (menu == 3) {
			System.out.println("식혜를 선택하셨군요!");
		}else {
			System.out.println("잘못 선택하셨군요");
		}// end if
		System.out.println();
		
		System.out.println("예제 3.");
		String money = "800";
		if (Integer.parseInt(money) >= 2000) {
			System.out.println("선택 가능한 음료 : 콜라500, 주스1000, 식혜1500");
		}else if (Integer.parseInt(money) >= 1000) {
			System.out.println("선택 가능한 음료 : 콜라500, 주스1000");
		}else if (Integer.parseInt(money) >= 500) {
			System.out.println("선택 가능한 음료 : 콜라500");
		}else if (Integer.parseInt(money) < 500){
			System.out.println("금액이 부족합니다.");
		}// end if
		System.out.println();
		
		
	}// end main
	
}// end class
