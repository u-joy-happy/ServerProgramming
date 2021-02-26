package test.com;

import test.com.Test01MemberOuter.Inner;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("inner class");

//		##### default class >> member inner class #####
		Test01MemberOuter outer = new Test01MemberOuter();
		Inner in = outer.new Inner();
		in.test();

//		##### static inner #####
		System.out.println(test.com.Test01StaticOuter.Inner.name);
		test.com.Test01StaticOuter.Inner.test();
		test.com.Test01StaticOuter.Inner in2 = new test.com.Test01StaticOuter.Inner();
		System.out.println(in2.email);
		

		// 3.local inner
		class Inner {
			int age;

			public int sum() {
				return age + 100;
			}
		}
		Inner in3 = new Inner();
		System.out.println(in3.sum());

		// 4.무명 내부클래스Anonymous inner
		TestAbs ab = new TestAbs() { // 리터럴
			int x;

			public void aaa() {
				System.out.println("aaa()...");
			}

			@Override
			public void bbb() {
				System.out.println("bbb()...");
			}
		};
		
		test.com.Test01StaticOuter.Inner.test2(ab);

	}

}
