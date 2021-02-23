package test.com;

public class Student extends Person {

	private int year;
	private int ban;
	private int num;
//	-> 상속 받은 필드 중 자식 객체에서 값을 대입 해준 경우 기본 값은 this
//	-> 값을 따로 대입 해주지 않은 경우 기본 값은 super
	private int age = 44;
	private String name = "lee";
	
	public void study() {
		System.out.println("Student : study() --------");
		super.eat();
		eat();
		sleep();
	}
	
//	##### method 재정의 : Overriding #####
	@Override
	public void eat() {
		System.out.println("Student : eat() --------- 라면 : Override");
	}

//	public void sleep() {
//		System.out.println("sleep() --------");
//	}
	
//	public void eat() {
//		System.out.println("eat() --------");
//	}

	@Override
	public String toString() {
		return "Student [year=" + year + ", ban=" + ban + ", num=" + num + ", age="
				+ /* this. */super.age + ", name=" + /* super. */this.name + "]";
	}
	

}
