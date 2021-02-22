package test.com;

public class Test01Person {

	String name;
	int age;
	double weight;
	
	
//	##### overloading #####
//	-> 매개변수 개수, 순서, 타입으로 구분
//	-> 생성자를 정의하는 목적 : 객체를 생성하며 필드 값 초기화
	
	public Test01Person() {
		System.out.println("Created Person Object");
		this.name = "효주";
		this.age = 33;
		this.weight = 22.2;
	}
	
	public Test01Person(String name) {
		this.name = name;
		this.age = 33;
		this.weight = 22.2;
		System.out.println("Created Person( " + name + " ) Object");
	}
	
	public Test01Person(char[] name) {
		System.out.println("Created Person( " + new String(name) + " ) Object");
		this.name = new String(name);
		this.age = 33;
		this.weight = 22.2;
	}
	
	public Test01Person(int i) {
		System.out.println("Created Person( " + i + " ) Object");
	}
	
	public Test01Person(int i, int j) {
		System.out.println("Created Person( " + i + " " + j + " ) Object");
	}

	public Test01Person(String[] strings) {
		System.out.print("Created Person( ");
		for(String s : strings) {
			System.out.print(s + " ");
		}
		System.out.print(") Object");
		System.out.println();
	}
	
	public Test01Person(int[] ii) {
		System.out.print("Created Person( ");
		for(int i : ii) {
			System.out.print(i + " ");
		}
		System.out.print(") Object");
		System.out.println();
	}

	public Test01Person(String name, int age, double weight) {
		System.out.println("Created Person(name:" + name + " age:" + age + 
				" weight:" + weight);
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	

}// end class
