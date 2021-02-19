package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Variable5 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("variable5");
		
//		##### 값을 입력받는 기능 구현 #####
//		-> java.io
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		##### 노트북의 정보를 다루는 프로그램 #####
//		필요 데이터 : 모델명, 가격, 무게 
		System.out.println();
		System.out.println("===== 노트북 정보 입력 =====");
		System.out.println("input model name");
		String modelName = br.readLine();
		System.out.println("input price");
		int price = Integer.parseInt(br.readLine());
		System.out.println("input weight");
		double weight = Double.parseDouble(br.readLine());
		
		System.out.println();
		System.out.println("모델 명 : " + modelName);
		System.out.println("가격(10%up) : " + (int)(price * 1.1) + "원");
		System.out.println("무게(200%up) : " + weight*2 + "kg");
		System.out.println("=========================");
		System.out.println();
		
		
	}// end main
	
}// end class
