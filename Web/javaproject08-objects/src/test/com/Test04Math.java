package test.com;

public class Test04Math {
	
	public static void main(String[] args) {
		System.out.println("math");
		
		System.out.println("Math.PI : " + Math.PI);
		System.out.println("Math.abs(-111) : " + Math.abs(-111));
		System.out.println();
		
		System.out.println("return Type : Real Number");
		System.out.println("Math.floor(Math.PI) : " + Math.floor(Math.PI));
		System.out.println("Math.floor(99.99) : " + Math.floor(99.99));
		System.out.println();
		
		System.out.println("return Type : Integer");
		System.out.println("Math.round(Math.PI) : " + Math.round(Math.PI));
		System.out.println("Math.round(99.99) : " + Math.round(99.99));
		System.out.println();
		
		System.out.println("return Type : Real Number");
		System.out.println("Math.ceil(Math.PI) : " + Math.ceil(Math.PI));
		System.out.println("Math.ceil(99.99) : " + Math.ceil(99.99));
		System.out.println();
		
		System.out.println("Max Number");
		System.out.println("Math.max(99.99, 99.999) : " + Math.max(99.99, 99.999));
		System.out.println("Math.max(99, 100) : " + Math.max(99, 100));
		System.out.println();
		
		System.out.println("Min Number");
		System.out.println("Math.min(99.99, 99.999) : " + Math.min(99.99, 99.999));
		System.out.println("Math.min(99, 100) : " + Math.min(99, 100));
		System.out.println();
		
		System.out.println("Power");
		System.out.println("Math.pow(2, 8) : " + Math.pow(2, 8));
		System.out.println("Math.pow(2, 8) : " + Math.pow(2, 8));
		System.out.println();
		
		System.out.println("Random");
		System.out.println("random : " + Math.random());
		System.out.println("random : " + (int)Math.random()*10);
		System.out.println();
		
	}
}
