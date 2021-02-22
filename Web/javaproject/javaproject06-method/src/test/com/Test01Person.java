package test.com;

public class Test01Person {

//	##### method 문법 #####
//	-> [접근제어자] (static) [returnType or void] methodName(parameter){}
	
//	##### 잠자기 기능 수행 메서드 #####
	void sleep() {
		String name = null;
		name = "aaa";
		if(name == null) 
			return;
		System.out.println("if에 해당 안될경우");
		
		return; //콜 한 곳에 데이터가 있다면 반환값을 가지고 메서드를 빠져나감
	}
	
//	##### overloading #####
//	-> 메서드나 생성자에 동일이름을 사용하지만 매개변수 타입,개수,순서를 다르게 설정
//	-> return 타입과는 별개 적용
	void sleep(int x, String name) {
		
	}
	
	int sleep2() {
		return 100;
	}
	
	int sleep2(int x) {
		return 100 * x;
	}
	
	String sleep3() {
		return "Kim";
	}
	
	String sleep3(String msg, String name) {
		return msg + "Kim";
	}
	
	String[] sleep4() {
		return new String[] {"kim","kim","kim"};
	}
	
	String[] sleep4(double avg) {
		return new String[] {"kim","kim","kim"};
	}
	
	Test04Member sleep5() {
		return new Test04Member();
	}
	
	Test04Member sleep5(int x) {
		return new Test04Member();
	}
	
	Test04Member[] sleep6() {
		return new Test04Member[] {new Test04Member(), new Test04Member()};
	}
	Test04Member[] sleep6(byte b, boolean bl) {
		return new Test04Member[] {new Test04Member(), new Test04Member()};
	}
	
	void sleep7() {
		for(int i =1; i <= 7; i++) {
			System.out.println("sleep - " + i);
		}
//		return;
	}
	
}
