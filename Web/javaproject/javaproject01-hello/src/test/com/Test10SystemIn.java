package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10SystemIn {
	
	public static void main(String[] args) throws IOException {
		
//		##### 값을 입력받는 기능 구현 #####
//		-> java.io
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input model name");
		String modelName = br.readLine();
		
		System.out.println();
		System.out.println("모델 명 : " + modelName);
		
	}// end main
	
}// end class
