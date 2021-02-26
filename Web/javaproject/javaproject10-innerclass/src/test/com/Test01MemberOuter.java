package test.com;

public class Test01MemberOuter {

	int kor;
	
	public void aaa() {}
	
	
	public class Inner{
//		##### Inner Class #####
//		-> 모든 자원에 대해서 static이 올 수 없다.
//		-> 내부 클래스를 만드는 이유 : 
//			-> 내부 클래스를 담고 있는 객체의 자원을 가져다 쓸 경우 객체를 생성해야함
//			-> 하지만 내부클래스에서는 감싸고 있는 객체의 자원을 마음대로 사용할 수 있기 때문
		
		
		String name;
//		static String email;
		
		public void test() {
			System.out.println(kor);
			aaa();
		}
		
//		public static void test2() {}
		
	}
}
