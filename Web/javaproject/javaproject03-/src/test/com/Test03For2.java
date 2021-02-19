package test.com;

public class Test03For2 {
	public static void main(String[] args) {
		
//		##### 반복문 #####
		System.out.println("loof");
		System.out.println();
		
		
//		##### for #####
		
//		-> 10번 반복하는 for 문 사용
//		-> 출력 값 : 0123456789
		System.out.println("========== 예제 1. ==========");
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
//		-> 10번 반복하는 for 문 사용
//		-> 출력 값 : 01234
		System.out.println("========== 예제 2. ==========");
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			if(i == 4)
				break;
		}
		System.out.println();
		System.out.println();
		
//		-> 10번 반복하는 for 문 사용
//		-> 출력 값 : 012346789
		System.out.println("========== 예제 3. ==========");
		for(int i = 0; i < 10; i++) {
			if(i == 5) 
				continue;
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
//		-> 이중 for 문 사용
//		-> 출력 값 :
//		0123456789
//		0123456789
//		0123456789
		System.out.println("========== 예제 4. ==========");
		for(int j = 0; j < 3; j ++) {
			for(int i = 0; i < 10; i++) {
				System.out.print(i);
			} // for i 
			System.out.println();
		} // for j
		System.out.println();
		
		
	}
}






