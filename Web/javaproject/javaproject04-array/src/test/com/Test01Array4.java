package test.com;

import java.util.Iterator;

public class Test01Array4 {
	
	public static void main(String[] args) {
		System.out.println("array");
		System.out.println();
		
//		###### 배열 #####
		System.out.println("boolean 1차원 배열------------");
		boolean[] bools = new boolean[4];
		for(boolean b : bools) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("boolean 2차원 배열------------");
		boolean[][] boolss = new boolean[4][];
		boolss[0] = new boolean[4]; 
		boolss[1] = new boolean[4];
		boolss[2] = new boolean[4];
		boolss[3] = new boolean[4];
		for(boolean[] bb : boolss){
			for(boolean b : bb) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("char 1차원 배열------------");
		char[] cs = new char[3];
		for(char c : cs) {
			System.out.println(c + ":" + (int)c);
		}
		System.out.println();
		System.out.println("숫자 0의 문자코드 : " + (int)'0');
		System.out.println();
		
		System.out.println("char배열을 문자열로 변환 ------------");
		cs[0] = 'k';
		cs[1] = 'i';
		cs[2] = 'm';
		
		String s = new String(cs);
		System.out.println(s);
		System.out.println();
		
		System.out.println("정적 할당 + 동적 할당 ------------");
		
//		-> 2차원 배열의 정적 할당
//		char[][] css = new char[2][];  //2차원 배열의 공간을 할당 해 주지 않은 상태로 호출
//		System.out.println(css[0][4]); //NullPointerException
		
		char[][] css = new char[2][5]; //배열의 크기보다 큰 인덱스번호로 배열 호출
//		System.out.println(css[0][5]); //IndexOutOfBoundsException
		
		css[0] = new char[] {'a','b','c','d','e'};
		css[1]= new char[] {'f','g','h','i','j','k'};
		
		for(char[] cc : css) {
			for(char c : cc) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		
		
		
	}// end main
	
}// end class
