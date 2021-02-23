package test.com;

import java.util.Random;

public class Test05Random {

	public static void main(String[] args) {
		System.out.println("random");

		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextBoolean());
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextInt());
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextInt(5));
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextDouble());
		}
		System.out.println();

		String[] class02 = new String[] { "양성호", "김수경", "이혜빈", "하예슬", 
				"황경훈", "이경현", "안혜인", "김윤창", "길현경", "박시원", "정효경" };

		System.out.println(class02[ran.nextInt(class02.length)]);
//		for(int i = 0; i < class02.length; i++) {
//			System.out.println(class02[ran.nextInt(class02.length)]);
//		}
		
		
		
		
		
		
	}
}
