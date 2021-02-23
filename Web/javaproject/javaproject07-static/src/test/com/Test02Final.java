package test.com;

public class Test02Final {
	
//	##### final variable #####
	String name;
	final String email = "aaa@aaa.com"; //초기화 필수
	static final String userName = "홍길동";
	
	
	public Test02Final() {
		name = "kim";
//		email = "bbb@bbb.com";
	}
	
//	##### final method #####
//	-> override 불가 / 재정의 불가
	public final void test() {
		System.out.println("final test");
	}
	
//	##### final class #####
//	-> 상속 불가
}
