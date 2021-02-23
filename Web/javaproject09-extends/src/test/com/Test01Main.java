package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("extends");
		System.out.println();
		
		Person p = new Person();
		System.out.println(p);
		
		Student st = new Student();
		System.out.println(st);
		System.out.println();
		
		st.study();
		System.out.println();
		
		
	}
	
}
