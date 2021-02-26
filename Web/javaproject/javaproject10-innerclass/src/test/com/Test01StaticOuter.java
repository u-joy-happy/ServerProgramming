package test.com;

public class Test01StaticOuter {

	public static class Inner {
//		-> Inner class 안에서 static을 선언 하면 final로 선언됨
		static String name;
		String email;

		public static void test() {
			System.out.println("static  test()...");
		}

		public static void test2(TestAbs ab) {
			System.out.println("test2()..." + ab);
			ab.bbb();
		}
	}
}
