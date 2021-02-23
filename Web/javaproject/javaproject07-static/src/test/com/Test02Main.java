package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("final");
		System.out.println();
		
//		기본 변수 입츌력(set,get) 가능
		int i = 10; 
		i = 100;
		i = 1000;
		
//		final 변수 츌력(get)만 가능 (읽기 전용)
//		-> 선언시 초기화 필수
		final int k = 10; 
//		k = 100;
//		k = 1000;
	}

}
