package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("static");
		System.out.println();
		
		Test01Static st = new Test01Static();
		System.out.println(st.num);
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(Test01Static.age);
		
		st.test();
		Test01Static.test2();
	}

}
