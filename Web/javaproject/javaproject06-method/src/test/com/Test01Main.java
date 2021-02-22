package test.com;

public class Test01Main {

	public static void main(String[] args) {
		Test01Person p = new Test01Person();
		p.sleep7();
		System.out.println();
		p.sleep7();
		System.out.println();
		p.sleep7();
		System.out.println();
		
		p.sleep(100, "kim");
		int x = p.sleep2();
		System.out.println(x);
	}

}
