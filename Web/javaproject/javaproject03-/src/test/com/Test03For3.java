package test.com;

public class Test03For3 {
	public static void main(String[] args) {
		
//		##### 반복문 #####
		System.out.print("loof");
		System.out.println();
		
		
//		##### 구구단 프로그램 #####
		
		System.out.println("========== 예제 5. 구구단 ==========");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (i*j));
			}
//			if(i ==3) {
//				break;
//			}
			System.out.println();
		}
		System.out.println();
		
	}
}






