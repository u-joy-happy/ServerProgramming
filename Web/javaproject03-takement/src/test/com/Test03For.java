package test.com;

public class Test03For {
	public static void main(String[] args) {
		
//		##### 반복문 #####
		System.out.println("loof");
		System.out.println();
		
		
//		##### for #####
		System.out.println("========== for ==========");
		for(int i = 0; i < 10; i++) 
			System.out.println("Hello - " + i);
		
		System.out.println();
		
		System.out.println("========== 짝수 출력 방법 1 ==========");
		for(int i = 0; i < 10; i++) 
			if(i%2==0) 
				System.out.println("Hello - " + i);
				
		
		System.out.println();
		
		System.out.println("========== 홀수 출력 방법 1 ==========");
		for(int i = 0; i < 10; i++) {
			if(i%2==1) {
				System.out.println("Hello - " + i);
			}
		}
		System.out.println();
		
		System.out.println("========== 짝수 출력 방법 2 ==========");
		for(int i = 0; i < 10; i+=2) {
			System.out.println("Hello - " + i);
		}
		System.out.println();
		
		System.out.println("========== 홀수 출력 방법 2 ==========");
		for(int i = 1; i < 10; i+=2) {
			System.out.println("Hello - " + i);
		}
		System.out.println();
		
		System.out.println("========== char이용 방법 1 ==========");
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.println("Hello - " + i);
		}
		System.out.println();
		
		System.out.println("========== char이용 방법 2 ==========");
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.println("Hello - " + i);
		}
		System.out.println();
	}
}
