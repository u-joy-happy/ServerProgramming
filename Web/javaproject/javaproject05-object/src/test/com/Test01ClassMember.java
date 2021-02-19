package test.com;

public class Test01ClassMember {

	public static void main(String[] args) {
		System.out.println("object");
		System.out.println();
//		##### Object Oriented Programming #####
//		-> 변수는 하나의 데이터타입으로 정의하고 사용
//		-> 배열은 하나의 데이터타입의 여러 값을 정의하고 사용
//		-> 객체는 여러 데이터타입을 정의하고 사용
//		-> 객체를 생성하려면 클래스가 존재 해야 함
//		-> 클래스 구성요소 : 필드, 메서드, 생성자, 내부클래스, 어노테이션, 초기화 블럭, 상속여부
		
		String str1 = new String();
		String str2 = new String("kim");
		String str3 = new String(new char[] {'l', 'e', 'e'});
		
		System.out.println("default Contructor -----------");
		Test01Person p = new Test01Person();
		System.out.println(p); 
		System.out.println("value -----------------------");
		System.out.println(p.name); 
		System.out.println(p.age); 
		System.out.println(p.weight); 
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("String Contructor -----------");
		p = new Test01Person("kim");
		System.out.println(p);
		System.out.println("value -----------------------");
		System.out.println(p.name); 
		System.out.println(p.age); 
		System.out.println(p.weight); 
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("char[] Contructor -----------");
		p = new Test01Person(new char[] {'l', 'e', 'e'});
		System.out.println(p);
		System.out.println("value -----------------------");
		System.out.println(p.name); 
		System.out.println(p.age); 
		System.out.println(p.weight); 
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("int Contructor -----------");
		p = new Test01Person(100);
		System.out.println(p);
		System.out.println();
		
		System.out.println("int, int Contructor -----------");
		p = new Test01Person(100, 200);
		System.out.println(p);
		System.out.println();
		
		System.out.println("String[] Contructor -----------");
		p = new Test01Person(new String[] {"kim", "lee", "han"});
		System.out.println(p);
		System.out.println();
		
		System.out.println("int[] Contructor -----------");
		p = new Test01Person(new int[] {11,22,33});
		System.out.println(p);
		System.out.println();
		
		System.out.println("Multiple Contructor -----------");
		p = new Test01Person("kim", 22, 33.3);
		System.out.println(p);
		System.out.println();
		p.name = "han";
		p.age = 66;
		p.weight = 128;
		System.out.println("value -----------------------");
		System.out.println(p.name); 
		System.out.println(p.age); 
		System.out.println(p.weight); 
		System.out.println("-----------------------------");
		System.out.println();
		
		
	}// end main

}// end class
